public class A1093369_0324_1 {
    public static void main(String[] args){
        double[] distance_Num = new double[4];
        animal Animal=new animal();
        
        Animal.name[0] = "雪寶";
        Animal.name[1] = "驢子";
        Animal.name[2] = "安那";
        Animal.name[3] = "愛沙";

        Animal.height[0] = 1.1f;
        Animal.height[1] = 1.5f;
        Animal.height[2] = 1.7f;
        Animal.height[3] = 1.7f;

        Animal.weight[0] = 52;
        Animal.weight[1] = 99;
        Animal.weight[2] = 48;
        Animal.weight[3] = 50;

        Animal.speed[0] = 100;
        Animal.speed[1] = 200;
        Animal.speed[2] = 120;
        Animal.speed[3] = 120;

        Animal.show();
        distance_Num = Animal.distance();
        System.out.printf("雪寶奔跑的距離為：%.2f\n驢子奔跑的距離為：%.2f\n安那奔跑的距離為：%.2f\n愛沙奔跑的距離為：%.2f\n",distance_Num[0],distance_Num[1],distance_Num[2],distance_Num[3]);
    } 
}