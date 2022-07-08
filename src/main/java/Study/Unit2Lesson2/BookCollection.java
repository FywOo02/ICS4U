package Study.Unit2Lesson2;

import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/04/20/21:28
 * @Description:
 */
public class BookCollection {
    Book[] books = new Book[999];
    int num=0;

    public void inputBooksData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many books you want to input data");
        num = sc.nextInt();
        for(int i=0; i<num; i++){
            books[i] = new Book();
            System.out.println("The id of book is: ");
            books[i].setBookId(sc.next());
            System.out.println("The title of book is: ");
            books[i].setBookTitle(sc.next());
            System.out.println("The price of book is: ");
            books[i].setPrice(sc.nextDouble());
        }
    }
    public void outputBooksData(){
        System.out.println("Book's Id\tTitle\tPrice");
        for (int i=0; i<num; i++){
            System.out.println("\t"+books[i].getBookId()+"\t\t"
                    +books[i].getBookTitle()+"\t"+books[i].getPrice());
        }
    }
}
