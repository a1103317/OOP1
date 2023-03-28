import java.util.Scanner;

class animal {
    String name;
    double height;
    double weight;
    double speed;

    public animal(String name, double height, double weight, double speed){             //construct當創建一個新物件時，它會被自動呼叫。                                                                              
        this.height = height;                                                           //建構子用於初始化物件的屬性。在Java中，建構子方法名稱與類別名稱相同，並且沒有返回值。
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public double distance(double x){
        return x * speed;
    }

    public double distance(double x , double y){
        return x * y * speed;
    }

    public void show(){
        System.out.println("姓名：" +name+ "\t身高（公尺）：" +height+ "\t體重（公斤）：" +weight+ "\t速度：" +speed);
    }

}




public class A1103317_0324_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        animal[] members = new animal[4];           
        members[0] = new animal("Olaf", 1.1 , 52 , 100);
        members[1] = new animal("Donkey", 1.5 , 99 , 200);
        members[2] = new animal("Anna", 1.7 , 48 , 120);
        members[3] = new animal("Elsa", 1.7 , 50 , 120);
        
        for(int i = 0 ; i < members.length ; i++){
            members[i].show();
        }
        
        for(int i = 0 ; i < members.length ; i++){
        System.out.print("請"+members[i].name+"輸入時間（分鐘）：");
        double x = scanner.nextDouble();
        System.out.print("請"+members[i].name+"輸入加速度(若為等速運動，加速度請輸入0)：");
        double y = scanner.nextDouble();

        if(y == 0){
            System.out.println(members[i].name+ "奔跑距離為（公尺）:"  +members[i].distance(x));
        }else{
            System.out.println(members[i].name+ "奔跑距離為（公尺）:"  +members[i].distance(x,y));
        }
        }
    }
}
