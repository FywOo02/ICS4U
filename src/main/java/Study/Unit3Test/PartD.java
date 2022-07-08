package Study.Unit3Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/05/09/21:18
 * @Description:
 */
public class PartD {
    public static void writeEmployeeName() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("Employee.txt"));
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of employees' name you want to enter to the file");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("What is your name ?");
            printWriter.println(sc.next());
        }
        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        writeEmployeeName();
    }
}
