package Study;

import java.util.Scanner;

public class day3_Quiz {
    public static void StringCompare(String s1, String s2){
        if(s1.compareTo(s2) == 0){
            System.out.print("They have same value\n"+s1+"\n"+s2);
        }else if(s1.compareTo(s2)<0){
            System.out.println("The value of "+s1+"is less than"+s2);
            System.out.println(s1);
            System.out.println(s2);
        }else{
            System.out.println("The value of "+s1+"is larger than"+s2);
            System.out.println(s2);
            System.out.println(s1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Please, enter the second string");
        String s2 = sc.nextLine();
        StringCompare(s1,s2);
    }
}
