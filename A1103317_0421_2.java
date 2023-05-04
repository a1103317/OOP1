import java.util.Scanner;
public class A1103317_0421_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String date;
        String regex1 = "^(\\d{4})/(0?[1-9]|1[0-2])/(0?[1-9]|[12]\\d|3[01])$";
        String regex2 = "^(0?[1-9]|1[0-2])/(0?[1-9]|[12]\\d|3[01])/(\\d{4})$";

        date = input.nextLine();
        if(date.matches(regex1)||date.matches(regex2)){
            System.out.println("true");
        }else{
            System.out.printf("%s", date);
        }
        
    }
}
