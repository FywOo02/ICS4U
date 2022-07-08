package Study;

import java.util.Scanner;

public class day1_ClassWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first integer number");
        int num1 = sc.nextInt();
        System.out.println("Please, enter the second integer number");
        int num2 = sc.nextInt();
        int IntDiv = num1/num2;
        float FloatDiv = num1/num2;
        System.out.println("The division in Integer type is "+IntDiv);
        System.out.println("The division in float type is "+FloatDiv);
    }
}
