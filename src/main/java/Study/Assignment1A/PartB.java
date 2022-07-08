package Study.Assignment1A;

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first number");
        String s1 = sc.nextLine();
        System.out.println("Please, enter the second number");
        String s2 = sc.nextLine();
        float num1 = Float.parseFloat(s1);
        float num2 = Float.parseFloat(s2);
        float result = Math.round(num1/num2*1000)/1000f;
        System.out.println("The final result of division of two numbers is "+result);
    }
}
