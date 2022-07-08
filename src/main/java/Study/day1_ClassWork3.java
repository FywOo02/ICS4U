package Study;

import java.util.Scanner;

public class day1_ClassWork3 {
    public static void main(String[] args) {
        int evenSum = 0;
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[3];
        for(int i=0; i<numArr.length; i++){
            System.out.println("Please,enter a Integer number");
            numArr[i] = sc.nextInt();
        }
        for (int j=0; j<numArr.length; j++){
            System.out.println(numArr[j]);
            if(numArr[j] % 2 == 0)
                evenSum = evenSum + numArr[j];
        }
        System.out.println(evenSum);
    }
}
