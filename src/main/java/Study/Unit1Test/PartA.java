package Study.Unit1Test;

import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/04/17/13:37
 * @Description:
 */
public class PartA {
    public double stringDivde(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first number");
        String stringNum1 = sc.next();
        System.out.println("Please, enter the second number");
        String stringNum2 = sc.next();
        double doubleNum1 = Double.parseDouble(stringNum1);
        double doubleNum2 = Double.parseDouble(stringNum2);
        double result = doubleNum1/doubleNum2;
        return Math.round(result*100)/100.0;
    }

    public static void main(String[] args) {
        PartA test = new PartA();
        double result = test.stringDivde();
        System.out.println("The final answer of division is "+result);
    }
}
