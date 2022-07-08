import Study.Assignment1B.Question1a;
import Study.Assignment1B.Question1b;
import Study.Assignment1B.Quetion1c.Book;
import org.junit.Test;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Cho
 * @Date: 2022/04/13/21:09
 * @Description:
 */
    public class Assignment1bTest {
        @Test
        public void Question1aTest() {
            System.out.println(Question1a.DividePrime());
        }
        @Test
        public void Question1bTest(){
            System.out.println(Question1b.TemperatureConvert());
        }
        @Test
        public void Qustion1cTest(){
            //create a Array with elements' data in type of Book
            Book[] bookArray = {
                    new Book("Masque of the red death"),
                    new Book("Lord of fly"),
                    new Book("One hour"),
                    new Book("Great Gatsby")
            };
            //use sort method in Arrays class to sort the book array
            Arrays.sort(bookArray);
            //print the sorted book array
            System.out.println("Here is the sorted name of books");
            for(int i=0; i<bookArray.length; i++){
                System.out.println(bookArray[i].bookName);
            }
        }

    }
