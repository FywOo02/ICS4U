package Study.Assignment3B;

import java.io.*;
import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/05/08/12:08
 * @Description:
 */
public class Question1 {
    public static void writeMark() throws IOException {
        // create printwriter object to write the mark to file
        PrintWriter printWriter = new PrintWriter(new FileWriter("Mark.txt"));
        Scanner sc = new Scanner(System.in);
        System.out.println("How many marks of students you want to write to file");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("enter the mark of students");
            // write the marks to file
            printWriter.println(sc.nextInt());
        }
        // dealloc
        printWriter.close();
    }
    public static int readMark() throws FileNotFoundException {
        // create scanner object to read mark from file
        Scanner read = new Scanner(new FileReader("Mark.txt"));
        int i = 0;
        int[] ints  = new int[99];
        // read the marks and enter them into array
        do{
            ints[i] = read.nextInt();
            i++;
        }while (read.hasNextInt());
        // dealloc
        read.close();
        // basic algorithm to find the maximum value of an  array
        int max = 0;
        for(int j=1; j<ints.length; j++){
            if(ints[max]<ints[j]){
                ints[max] = ints[j];
            }
        }
        return ints[max];
    }

    public static void main(String[] args) throws IOException {
        writeMark();
        int max = readMark();
        System.out.println("The maximum value of test is "+max);
    }
}
