import java.util.*;

public class A1103317_0317{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入整數 m： ");
        int m = sc.nextInt();

        System.out.print("請輸入整數 n： ");
        int n = sc.nextInt();

        int [][] mn_array = new int[m][n];                      // 建立一個 m x n 的二維陣列，用來儲存產生的值

        for(int j = 0 ; j < m ; j++){                          //使用巢狀的 for 迴圈來儲存資料。第一個迴圈用來訪問二維陣列的每一行，
            for(int i = 0 ; i < n ; i++){                      //第二個迴圈用來訪問每一行中的每一個元素。
                mn_array[i][j] = ( i + 1 ) * ( j + 1 );        //在每一個元素上，程式碼會計算(i + 1) * (j + 1) 的值，並把結果設定為當前元素的值。
                }
        }

        System.out.println("用 foreach 讀出資料：");
        for(int [] row : mn_array ){                     //for(type集合中元素的數據類型  element臨時變量  :  collection要遍歷的集合) { }
            for(int value : row){
                    System.out.printf("%d \t",value);
            }
            System.out.println();                                                    
        }
    }
}