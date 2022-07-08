package Study;

import java.util.Scanner;

public class day2_ClassWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first number");
        String str1 = sc.nextLine();
        System.out.println("Please,enter the second number");
        String str2 = sc.nextLine();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        double division = (double) num1 / (double) num2;
        division = Math.round(division*100)/100.0;
        System.out.println("The result of the division is "+division);
    }
}
