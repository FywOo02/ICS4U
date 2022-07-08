package Study.Assignment1A;

import java.util.HashMap;
import java.util.Scanner;

public class PartD_HashMapVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> studentMark = new HashMap<>();
        System.out.println("please, enter the mark of first student");
        studentMark.put("first",sc.nextInt());
        System.out.println("please, enter the mark of second student");
        studentMark.put("second",sc.nextInt());
        System.out.println("please, enter the mark of first student");
        studentMark.put("third",sc.nextInt());
        for(String key: studentMark.keySet()){
            if(studentMark.get(key) > 100 || studentMark.get(key) < 0)
                System.out.println("Wrong Mark Enter");
            else if(studentMark.get(key)<50)
                System.out.println("The "+key+" student fail the test");
            else
                System.out.println("The "+key+" student pass the test");
        }
    }
}
