import java.util.Arrays;
import java.util.Scanner;

public class A1093369_0505 {
    public static void main(String[] args) {
        int[] winningNumbers = { 3, 7, 21, 35, 42, 49 };
        int[] inputNumbers = new int[6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入六個整數:");

        for (int i = 0; i < 6; i++) {
            System.out.printf("請輸入第 %d 個整數: ", i + 1);

            try {
                int number = Integer.parseInt(scanner.nextLine());

                if (number < 1 || number > 49) {
                    throw new IllegalArgumentException("數字必須介於 1 和 49 之間。");
                }

                inputNumbers[i] = number;
            } catch (NumberFormatException e) {
                System.err.println("請輸入整數。");
                i--;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                i--;
            }
        }

        Arrays.sort(inputNumbers);
        System.out.println("您輸入的數字是: " + Arrays.toString(inputNumbers));

        Arrays.sort(winningNumbers);
        System.out.println("中獎號碼是: " + Arrays.toString(winningNumbers));

        if (Arrays.equals(inputNumbers, winningNumbers)) {
            System.out.println("恭喜您中獎了！");
        } else {
            System.out.println("很遺憾，您沒有中獎。");
        }
    }
}