package Study.Unit1Test;

import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/04/17/13:52
 * @Description:
 */
public class PartB {
    public static void main(String[] args) {
        String[] bookArray = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the name of first book");
        bookArray[0] = sc.next();
        System.out.println("Please, enter the name of second book");
        bookArray[1] = sc.next();
        System.out.println("Please, enter the name of third book");
        bookArray[2] = sc.next();
        bookSort(bookArray);

    }
    public static void bookSort(String[] bookArray){
        for(int i=0; i<bookArray.length-1; i++){
            int max = i;
            for(int j=i+1; j<bookArray.length; j++){
                if(bookArray[max].compareTo(bookArray[j])<0){
                    max = j;
                }
                String temp = bookArray[max];
                bookArray[max]=bookArray[j];
                bookArray[j] = temp;
            }
        }
        System.out.println("The final alphabetical order is");
        for(int i=0; i<bookArray.length; i++){
            System.out.println(bookArray[i]+"\t");
        }
    }
}
