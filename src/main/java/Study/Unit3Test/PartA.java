package Study.Unit3Test;

import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/05/09/20:35
 * @Description:
 */
public class PartA {
    public static void calWeekHours(int emp){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int[][] dayHours = new int[emp][7];
        String[] name = new String[emp];
        int[] weekHours = new int[emp];
        for(int i=0; i<emp; i++){
            System.out.println("What is your name?");
            name[i] = sc.next();
            for(int j=0; j<7; j++){
                System.out.println("How many hours do you work today");
                dayHours[i][j] = sc.nextInt();
                count += dayHours[i][j];
            }
            weekHours[i] = count;
            count = 0;
        }
        System.out.println("Name\t\tweek hours");
        for(int k=0; k<emp; k++){
            System.out.println(name[k]+"\t\t"+weekHours[k]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees do you want to enter");
        int emp = sc.nextInt();
        calWeekHours(emp);
    }
}
