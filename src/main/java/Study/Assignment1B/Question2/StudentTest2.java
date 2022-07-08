package Study.Assignment1B.Question2;

/**
 *
 * @Author: Cho
 * @Date: 2022/04/13/23:43
 * @Description:
 */
public class StudentTest2 {
    public static void main(String[] args) {
        Student2 Cho = new Student2();
        Student2 Owen = new Student2();
        Student2 Jason = new Student2();
        Student2[] students = {
                Cho,
                Owen,
                Jason
        };
        Student2.enterBasicInfo(students);
        Student2.averageCal(students);
        Student2.passCal(students);
        Student2.getAllData(students);
    }
}
