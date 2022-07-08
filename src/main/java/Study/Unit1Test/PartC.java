package Study.Unit1Test;


import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/04/17/14:24
 * @Description:
 */
public class PartC {
        // This method does not include test, User should creat main class for testing by themselves
        public static String DividePrime(){
            // use the Scanner to get information from user's keyboard
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter a number");
            int num1 = sc.nextInt();
            // the number less than 2 must not be a prime number, such as 1,0,-1,-2
            if(num1 < 2) {
                return num1 + " is not a prime number";
            }else{
                //the number large than or equal to 2 should be tested
                for (int i = 2; i < num1; i++) {
                    //A number is not prime if it is divisible by itself or by 1
                    if (num1 % i == 0)
                        return num1 + " is not a prime number";
                }
            }
            // After checking every condition, the number that make it this far are prime
            return num1 + " is a prime number";
        }

        public static void main(String[] args) {
            System.out.println(DividePrime());
        }
    }
