package Study;

import java.text.DecimalFormat;
import java.util.Scanner;

public class day2_ClassWork3 {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter a number:");
            float num1=kb.nextFloat();
            System.out.println("Enter a number:");
            float num2=kb.nextFloat();
            DecimalFormat fm = new DecimalFormat("0.00");
            float result = num1+num2;
            System.out.println("The sum is "+fm.format(result));
        }
}
