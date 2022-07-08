package Study.Assignment1A;

import java.util.Scanner;

public class PartD_RegularVersion {
    public static void main(String[] args) {
        double[] studentMark = new double[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the mark of first student");
        studentMark[0] = sc.nextDouble();
        System.out.println("Please, enter the mark of second student");
        studentMark[1] = sc.nextDouble();
        System.out.println("Please, enter the mark of third student");
        studentMark[2] = sc.nextDouble();

        for(int i=0; i<studentMark.length; i++){
            if(studentMark[i]> 100 || studentMark[i] < 0){
                System.out.println("Wrong Mark Enter");
                continue;
            }
            switch (i){
                case 0:
                    if (studentMark[i]<50)
                        System.out.println("The first student fail the test");
                    else
                        System.out.println("The first student pass the test");
                    break;
                case 1:
                    if (studentMark[i]<50)
                        System.out.println("The second student fail the test");
                    else
                        System.out.println("The second student pass the test");
                    break;
                case 2:
                    if (studentMark[i]<50)
                        System.out.println("The third student fail the test");
                    else
                        System.out.println("The third student pass the test");
                    break;

            }
        }
    }
}
