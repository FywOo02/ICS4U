package Study.Assignment1B;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Cho
 * @Date: 2022/04/13/22:18
 * @Description:
 */
public class Question1b {
    // This method does not include test, User should creat main class for testing by themselves
    public static double TemperatureConvert(){
        // use the Scanner to get information from user's keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a value of temperature in Fahrenheit");
        String fStringTemp = sc.nextLine();
        //Converts the obtained string data into double type data
        double fDoubleTemp = Double.parseDouble(fStringTemp);
        // Through formula, calculate the result
        double cDoubleTemp = 5*(fDoubleTemp-32)/9;
        // Returns data accurate to two decimal places
        return Math.round(cDoubleTemp*100)/100.0;
    }
}
