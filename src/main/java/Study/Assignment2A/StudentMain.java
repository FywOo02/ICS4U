package Study.Assignment2A;


/**
 * @Author: Cho
 * @Date: 2022/04/20/21:55
 * @Description:
 */
public class StudentMain {
    public static void main(String[] args) {
        StudentsMark studentsMark = new StudentsMark();
        studentsMark.enterMarks();
        studentsMark.displayMarks();
        studentsMark.averageMark();
    }
}
