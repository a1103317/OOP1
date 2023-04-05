import java.util.*;

public class A1103317_0331 {
    public static void main(String[] args)throws Exception{
        
        Scanner sc = new Scanner(System.in);                                                              

        Animal.showinfo();                  //直接使用showinfo()這個方法，"歡迎進入冰雪奇緣系統"

        Animal Olaf = new Animal("Olaf", 1.1 , 52 , 100);           //創建了幾個 Animal 、Human 和 Snow 的物件，並且調用了它們的 show() 方法，用來顯示每個物件的詳細資料。
        Animal Donkey = new Animal("Donkey", 1.5 , 99 , 200);
        Human Anna = new Human("Anna", 1.7 , 48 , 120 ,"女");          
        Human Ake =  new Human("Ake", 1.9 , 80 , 150 , "男");       
        Human Hans = new Human("Hans", 1.8 , 78 , 130 , "男");
        Snow Elsa = new Snow("Elsa", 1.7 , 50 , 120 , "女" , "有");

        Olaf.show();
        Donkey.show();
        Anna.show(); 
        Ake.show();
        Hans.show();
        Elsa.show();
        
        System.out.println("請輸入Olaf跑步時間(分鐘)：");
        double Otime = sc.nextDouble();
        System.out.println("請輸入加速度(若為等速運動，加速度請輸入0)：");
        double Oa = sc.nextDouble();
        if(Oa == 0){
            System.out.println("奔跑距離為（公尺）:" +Olaf.distance(Otime));
        }else{
        System.out.println("奔跑距離為（公尺）:" +Olaf.distance(Otime, Oa));
        }

        System.out.println();

        System.out.println("請輸入Donkey跑步時間(分鐘)：");
        double Dtime = sc.nextDouble();
        System.out.println("請輸入加速度(若為等速運動，加速度請輸入0)：");
        double Da = sc.nextDouble();
        if(Da == 0){
            System.out.println("奔跑距離為（公尺）:" +Donkey.distance(Dtime));
        }else{
        System.out.println("奔跑距離為（公尺）:" +Donkey.distance(Dtime, Da));
        }
        
        System.out.println();

        System.out.println("請輸入Anna跑步時間(分鐘)：");
        double Anna_time = sc.nextDouble();
        System.out.println("請輸入加速度(若為等速運動，加速度請輸入0)：");
        double Anna_a = sc.nextDouble();
        if(Anna_a == 0){
            System.out.println("奔跑距離為（公尺）:" +Anna.distance(Anna_time));
        }else{
        System.out.println("奔跑距離為（公尺）:" +Anna.distance(Anna_time, Anna_a));
        }

        System.out.println();

        System.out.println("請輸入Ake跑步時間(分鐘)：");
        double Ake_time = sc.nextDouble();
        System.out.println("請輸入加速度(若為等速運動，加速度請輸入0)：");
        double Ake_a = sc.nextDouble();
        if(Ake_a == 0){
            System.out.println("奔跑距離為（公尺）:" +Ake.distance(Ake_time));
        }else{
        System.out.println("奔跑距離為（公尺）:" +Ake.distance(Ake_time, Ake_a));
        }

        System.out.println();

        System.out.println("請輸入Hans跑步時間(分鐘)：");
        double Htime = sc.nextDouble();
        System.out.println("請輸入加速度(若為等速運動，加速度請輸入0)：");
        double Ha = sc.nextDouble();
        if(Ha == 0){
            System.out.println("奔跑距離為（公尺）:" +Hans.distance(Htime));
        }else{
        System.out.println("奔跑距離為（公尺）:" +Hans.distance(Htime, Ha));
        }

        System.out.println();

        System.out.println("請輸入Elsa跑步時間(分鐘)：");
        double Etime = sc.nextDouble();
        System.out.println("請輸入加速度(若為等速運動，加速度請輸入0)：");
        double Ea = sc.nextDouble();
        if(Ea == 0){
            System.out.println("奔跑距離為（公尺）:" +Elsa.distance(Etime));
        }else{
        System.out.println("奔跑距離為（公尺）:" +Elsa.distance(Etime, Ea));
        }
    }
}
