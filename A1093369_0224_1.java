import java.util.Scanner;
public class A1093369_0224_1{
    public static void main(String[] args){
        System.out.printf("請輸入任意整數\n");
        Scanner enterNum = new Scanner(System.in);
        int num = enterNum.nextInt();
        if(num%2==0 || num==0){
            System.out.printf("您輸入的為偶數");
        }
        else{
            System.out.printf("您輸入的為奇數");
        }
    }
}