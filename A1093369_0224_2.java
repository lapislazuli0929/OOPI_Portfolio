import java.util.Scanner;
public class A1093369_0224_2{
    public static void main(String[] args){
        System.out.printf("請輸入攝氏溫度\n");
        Scanner enterNum = new Scanner(System.in);
        Double num = enterNum.nextDouble();
        Double Tem = ((num-32)*5/9);
        System.out.printf("將攝氏溫度轉換為華氏為"+Tem);
    }
}