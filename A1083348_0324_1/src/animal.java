import java.util.*;
public class animal{
String[] name = new String[4];
double[] height = new double[4];
double[] weight = new double[4];
double[] speed = new double[4];

    void show(){       
        System.out.printf("項目名稱\t身高(公尺)\t體重(公斤)\t數度(公尺/分鐘)\n");
        for(int i=0;i<4;i++){
            System.out.printf("%s\t\t%.2f\t\t%.2f\t\t%.2f\n",name[i],height[i],weight[i],speed[i]);    
        }
        System.out.println();
    }

    double[] distance(){
        double[] distanceNum = new double[4];
        int j = 1;
        double[] x = new double[4];
        double[] y = new double[4];
        Scanner scanner = new Scanner(System.in);
        Scanner test = new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.printf("請輸入%s的跑步時間(分鐘)\n",name[i]);
            while(j==1){
                x[i] = scanner.nextDouble();
                if(x[i]>=0 && x[i]<=60){
                    j = 0;
                }
                else{
                    System.out.printf("您未輸入或者是輸入錯誤的分鐘格式，請重新輸入\n");
                }
            }
            j=1;
            int k = 1;
            System.out.printf("是否存在加速度(y/n)？\n");
            while(k == 1){
                String o = "o";
                o = test.nextLine();
                switch(o){
                    case "y":
                        System.out.printf("請輸入%s跑步時的加速度\n",name[i]);  
                        y[i] = scanner.nextDouble();
                        k = 0;
                        break;
                    case "n":
                        y[i] = 1;
                        k = 0;
                        break;                               
                }
                if(k == 1 ){
                    System.out.printf("請輸入y or n\n");
                }
            }
            k = 1;
            distanceNum[i]=x[i]*y[i]*speed[i]; 
        }
        System.out.println();
        return distanceNum;
    }

}

