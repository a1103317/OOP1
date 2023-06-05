import java.io.*;

public class A1103317_0526_Student implements Serializable{

    private String name;
    private short EScore;
    private short JScore;
    private short MScore;

    public A1103317_0526_Student(String s, short e, short m, short j){
        name = s;       //姓名
        EScore = e;     //英文成績
        MScore = m;     //數學成績
        JScore = j;     //Java成績
    }

    public A1103317_0526_Student(){}

    //傳回姓名及各項成績資料的方法
    public String getN() { return name; }
    public short getE() { return EScore; }
    public short getM() { return MScore; }
    public short getJ() { return JScore; }

    //計算並傳回三科平均分別的方法
    public double getAvg(){
        return (EScore + MScore + JScore) / 3.0;
    }
}