package Study;

import java.util.Scanner;

public class day1_ClassWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first integer number");
        int num1 = sc.nextInt();
        System.out.println("Please, enter the second integer number");
        int num2 = sc.nextInt();
        int result = num1*num2;
        System.out.println("The product of entered numbers is " + result);
    }
}
