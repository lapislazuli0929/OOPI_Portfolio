public class A1093369_0331 {
    public static void main(String[] args){
        double[] distance_Num = new double[6];
        snow Snow=new snow();
        Snow.showinfo();


        Snow.name[0] = "雪寶";
        Snow.name[1] = "驢子";
        Snow.name[2] = "阿克";
        Snow.name[3] = "漢斯";
        Snow.name[4] = "安那";
        Snow.name[5] = "愛沙";

        Snow.height[0] = 1.1f;
        Snow.height[1] = 1.5f;
        Snow.height[2] = 1.9f;
        Snow.height[3] = 1.8f;
        Snow.height[4] = 1.7f;
        Snow.height[5] = 1.7f;

        Snow.weight[0] = 52;
        Snow.weight[1] = 99;
        Snow.weight[2] = 80;
        Snow.weight[3] = 78;
        Snow.weight[4] = 48;
        Snow.weight[5] = 50;

        Snow.speed[0] = 100;
        Snow.speed[1] = 200;
        Snow.speed[2] = 150;
        Snow.speed[3] = 130;
        Snow.speed[4] = 120;
        Snow.speed[5] = 120;

        Snow.sex[0] = "X";
        Snow.sex[1] = "X";
        Snow.sex[2] = "男";
        Snow.sex[3] = "男";
        Snow.sex[4] = "女";
        Snow.sex[5] = "女";

        Snow.skill[0] = "X";
        Snow.skill[1] = "X";
        Snow.skill[2] = "X";
        Snow.skill[3] = "X";
        Snow.skill[4] = "X";
        Snow.skill[5] = "Yes";

        Snow.show();
        distance_Num = Snow.distance();
        System.out.printf("雪寶奔跑的距離為：%.2f\n驢子奔跑的距離為：%.2f\n阿克奔跑的距離為：%.2f\n漢斯奔跑的距離為：%.2f\n安那奔跑的距離為：%.2f\n愛沙奔跑的距離為：%.2f\n",distance_Num[0],distance_Num[1],distance_Num[2],distance_Num[3],distance_Num[4],distance_Num[5]);
    } 
}