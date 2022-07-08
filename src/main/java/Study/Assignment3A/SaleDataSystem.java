package Study.Assignment3A;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/05/03/19:57
 * @Description:
 */
public class SaleDataSystem {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("saledata.txt"));
        double sum = 0;
        do {
            sum += sc.nextDouble();
        }while (sc.hasNext());
        System.out.println("The sum of sale is" +sum);
        sc.close();
    }
}
