package Study;

import java.util.Scanner;

public class day2_ClassWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number of kilometers");
        double kilometer = sc.nextDouble();
        System.out.println("Please, enter the number of liters of gases used");
        double liters = sc.nextDouble();
        double rate = Math.round(kilometer/liters*1000)/1000.0;
        System.out.println("The number of kilometers run per liter of gas is "+rate);
    }
}
