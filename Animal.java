public class Animal{
    public String name;
    public double height;
    public double weight;
    public double speed;


    public Animal(String name, double height, double weight, double speed){             //construct當創建一個新物件時，它會被自動呼叫。                                                                              
        this.height = height;                                                           //建構子用於初始化物件的屬性。在Java中，建構子方法名稱與類別名稱相同，並且沒有返回值。
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public void show(){                                                                                 
        System.out.println("姓名：" +this.name+ "\t身高（公尺）：" +this.height+ "\t體重（公斤）：" +this.weight+ "\t速度：" +this.speed);
    }

    public double distance(double x , double y){
        return x * y * speed;
    }

    public double distance(double x){
        return x * speed;
    }

    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }

    public void animal(){}
}


class Human extends Animal{
    public String gender;

    Human(String name, double height, double weight, double speed , String gender){       // 改写构造函数，可以在创建对象时就设置性别
        super(name , height , weight , speed);
        this.gender = gender;
    }

    public void show(){
        super.show();
        System.out.println("性別為："+gender);
    }
}


class Snow extends Human{
    public String Skill;

    Snow(String name, double height, double weight, double speed , String gender , String Skill){
        super(name , height , weight , speed , gender);
        this.Skill = Skill;
    }

    public void show(){
        super.show();
        System.out.println("冰凍技能："+Skill);
    }

    public double distance(double x , double y){
        return 2 * x * y * speed;
    }

    public double distance(double x){
        return 2 * x * speed;
    }
}
