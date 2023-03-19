import java.util.Scanner;
public class A1093369_0317_1{
    public static void main(String[] args){
        System.out.printf("請輸入第一個數字(n)：\n");
        Scanner enterNum = new Scanner(System.in);
        int n = enterNum.nextInt();
        System.out.printf("請輸入第二個數字(m)：\n");
        int m = enterNum.nextInt();
        int[][] x = new int[n][m];    
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int cal=0;
                cal=(i+1)*(j+1);
                x[i][j]=cal;
            }
        }
        System.out.printf("輸出結果為：\n");
        for(int[] k:x){
            for(int ans:k){ 
                System.out.printf("%d,",ans);
            }
            System.out.println();
        }
    }
}