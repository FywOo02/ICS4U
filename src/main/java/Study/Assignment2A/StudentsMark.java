package Study.Assignment2A;


import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/04/20/21:50
 * @Description:
 */
public class StudentsMark {
   Student[] students = new Student[999];
   int num = 0;

    /**
     * A method for inputting the information of students
     */
    public void enterMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much student you want to enter marks");
        num = sc.nextInt();
        for(int i=0; i<num; i++){
            students[i] = new Student();
            System.out.println("Please, enter the id of student");
            students[i].idNo = sc.next();
            System.out.println("Please, enter the name of student");
            students[i].name = sc.next();
            System.out.println("Please, enter the mark of student");
            students[i].mark = sc.nextInt();
        }
    }

    /**
     * A method for displaying the information of students
     */
    public void displayMarks(){
        System.out.print("Student Id\tStudent Name\tStudent Mark\n");
        for(int i=0; i<num; i++){
            System.out.println("\t"+students[i].idNo+"\t\t\t"+students[i].name+"\t\t\t"+students[i].mark);
        }
    }

    /**
     * A method for calculating the average mark of students
     */
    public void averageMark(){
        double sum = 0.0;
        double average = 0.0;
        for (int i=0; i<num; i++){
            sum = sum + students[i].mark;
        }
        average = sum/num;
        System.out.println("The average mark of students is: "+average);
    }
}
