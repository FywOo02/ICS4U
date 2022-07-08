package Study;
import java.util.Scanner;

public class day1_ExitSlip {
    static int num = 0;
    static float num2 = (float) 102.22;
    public static void main(String[] args) {
        System.out.println(num2);
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a integer number");
        num = sc.nextInt();
        if(num % 3 == 0){
            System.out.println(num+" could be divisible by 3");
        }else{
            System.out.println(num+" could not be divisible by 3");
        }
    }
}
