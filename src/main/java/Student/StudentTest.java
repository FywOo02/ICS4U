package Student;

/**
 *
 * @Author: Cho
 * @Date: 2022/04/13/23:43
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student Cho = new Student();
        Student Owen = new Student();
        Student Jason = new Student();
        Student[] student = {
                Cho,
                Owen,
                Jason
        };
        Student.enterBasicInfo(student);
        Student.averageCal(student);
        Student.passCal(student);
        Student.getAllData(student);
    }
}
