/*
第十題
請撰寫程式，讓使用者輪人代表攝氏溫度的值，程式則換算成華氏溫度並顯示結果
（提示：攝氏溫度等於華氏溫度減 32 度再乘上 5/9)。
*/
import java.util.Scanner;

public class A1103317_0224_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入攝氏溫度:(℃)");
        double C = input.nextDouble();

        double F = (C * 9/5) + 32;
        System.out.printf("華氏溫度為:%.1f",F);

    }
}



