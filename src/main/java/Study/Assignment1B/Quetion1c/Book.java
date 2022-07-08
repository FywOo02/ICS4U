package Study.Assignment1B.Quetion1c;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Cho
 * @Date: 2022/04/13/22:42
 * @Description:
 */
public class Book implements Comparable<Book>{
    //Set the global variable
    public String bookName;

    //Defines the constructor with parameters
    public Book(String bookName) {
        this.bookName = bookName;
    }
    // A method for sort the name of books
    public static void bookSort(Book[] books){
        Book temp = null;
        for(int i=0; i< books.length; i++){
            for (int j=i+1; j< books.length; j++){
                if(books[i].compareTo(books[j])>0) {
                    temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
    //Override the compareTo method due to Book class implement the Comparable interface
    @Override
    public int compareTo(Book o) {
        //when the bookname of o less than bookname be set in global variable, return -1
        if(this.bookName.compareTo(o.bookName) < 0){
            return -1;
        //when the bookname of o greater than bookname be set in global variable, return 1
        }else if(this.bookName.compareTo(o.bookName) > 0)
            return 1;
        //when the bookname of o equal to bookname be set in global variable, return 0
        else
            return 0;
    }

    public static void main(String[] args) {
        //create a Array with elements' data in type of Book
        Book[] bookArray = {
                new Book("Masque of the red death"),
                new Book("Lord of fly"),
                new Book("One hour"),
                new Book("Great Gatsby")
        };
        Book.bookSort(bookArray);
        for (int i=0; i<bookArray.length;i++){
            System.out.println(bookArray[i].bookName);
        }
    }
}
