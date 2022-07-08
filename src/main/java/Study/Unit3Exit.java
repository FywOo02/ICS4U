package Study;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/05/01/16:29
 * @Description:
 */
public class Unit3Exit {
        public static void main(String[] args) throws IOException {
            PrintWriter pw = new PrintWriter(new FileWriter("Marks.txt"));
            Scanner kb = new Scanner(System.in);
            System.out.println("How many marks you want to enter?");
            int size = kb.nextInt();
            for(int i = 0; i<size; i++) {
                System.out.println("Enter a mark:");
                pw.println(kb.nextInt());

            }
            pw.println(-1);
            pw.close();

            Scanner in = new Scanner(new FileReader("Marks.txt"));
            int x =0;
            do {
                x = in.nextInt();
                if(x!=-1)
                    System.out.println(x);
            }while(x!=-1);
            in.close();
        }
}

