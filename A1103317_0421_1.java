import java.util.*;

public class A1103317_0421_1{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入正確格式的電子郵箱信件：");
        String a = sc.nextLine();
        System.out.println(a.matches("[a-z 0-9._%+-]+@[a-z 0-9.]+\\.[a-z]{2,}"));
    }
}
