package Study.Assignment1B.Question2;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 *
 * @Author: Cho
 * @Date: 2022/04/13/23:32
 * @Description:
 */
public class Student2 {
    /**
     * define the basic global variables in Student class(id,name,mark)
     */
    int studentID;
    String studentName;
    double studentMark;
    /**
     * A method which include student information through keyboard input
     */
    public static void enterBasicInfo(Student2 @NotNull [] student){
        //array insert student in Student type
        // get information from keyboard
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<student.length; i++){
            System.out.println("Please,enter the student id");
            student[i].studentID = sc.nextInt();
            System.out.println("Please,enter the student name");
            student[i].studentName = sc.next();
            System.out.println("Please,enter the student mark");
            student[i].studentMark = sc.nextDouble();
        }
    }
    /**
     * A method that calculate the average mark of students
     */
    public static void averageCal(Student2[] student){
        double result = 0.0;
        //Iterate over the static array and calculate the average score
        for(int i=0; i<student.length; i++){
            result = result+student[i].studentMark;
        }
        System.out.println("The average mark of student is "+Math.round(result/student.length*100)/100.0);
    }

    /**
     * A method that counts how many student pass or fail the exam
     */
    public static void passCal(Student2[] student){
        int countPass = 0;
        //Iterate through the static array and calculate the pass rate
        for (int i=0; i<student.length; i++){
            if(student[i].studentMark >= 50)
                countPass++;
        }
        System.out.println("The number of student who pass the test is "+countPass);
        System.out.println("The number of student who didn't pass the test is "+(student.length-countPass));
    }

    /**
     * A method that could acquire all data of students
     */
    public static void getAllData(Student2[] student){
        //Iterate over the static array and get the data using the overridden toString method
        for(int i=0; i<student.length; i++){
            System.out.println(student[i].toString());
        }
    }

    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentMark=" + studentMark +
                '}';
    }
}
