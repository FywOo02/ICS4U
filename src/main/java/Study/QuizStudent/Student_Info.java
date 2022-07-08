package Study.QuizStudent;

import java.util.Scanner;

/**
 * @Author: Cho
 * @Date: 2022/04/17/16:38
 * @Description:
 */
public class Student_Info {
    Student[] students = new Student[3];

    public void inPutInfo(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<students.length; i++){
            students[i] = new Student();
            System.out.println("Please, enter the id of student");
            students[i].St_ID_No = sc.next();
            System.out.println("Please, enter the name of student");
            students[i].name = sc.next();
            System.out.println("Please, enter the mark of student");
            students[i].marks = sc.nextInt();
        }
    }
    public void outPutInfo(){
        System.out.print("Student Id\tStudent Name\tStudent Mark\n");
        for(int i=0; i<students.length; i++){
            System.out.println("\t"+students[i].St_ID_No+"\t\t\t"+students[i].name+"\t\t\t"+students[i].marks);
        }
    }
    public void passCal(){
        int countPass = 0;
        //Iterate through the static array and calculate the pass rate
        for (int i=0; i<students.length; i++){
            if(students[i].marks >= 50)
                countPass++;
        }
        System.out.println("The number of student who pass the test is "+countPass);
        System.out.println("The number of student who didn't pass the test is "+(students.length-countPass));
    }
}
