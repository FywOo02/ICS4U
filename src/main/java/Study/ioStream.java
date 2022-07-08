package Study;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/05/01/14:07
 * @Description:
 */
public class ioStream {
    public static void main(String[] args) throws IOException {
        printWriter();
    }

    public static void printWriter() throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("Employee.txt"));
        Scanner sc = new Scanner(System.in);
        System.out.println("How many information of employees you want to enter");
        int size = sc.nextInt();

        String last;
        String first;
        pw.println("First Name\t\t\tLast Name");
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the first name of employee");
            first = sc.next();
            System.out.println("Please enter the last name of employee");
            last = sc.next();
            pw.println("\t" + first + "\t\t\t" + last);
        }
        pw.close();
    }
    public static void printReader() throws IOException{
        Scanner sc = new Scanner(new FileReader("Employee.txt"));
        while(true){
            System.out.println(sc.nextLine());
        }
    }
}
