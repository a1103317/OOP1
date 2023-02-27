/*
第九題
讓使用者輸入任意整數，程式則判斷其為奇數或偶數，並顯示判斷結果。
*/


import java.util.Scanner;

public class A1103317_0224_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入任意整數:");
        long num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("此數為偶數");
        }else{
            System.out.println("此數為奇數");
        }

    }
}