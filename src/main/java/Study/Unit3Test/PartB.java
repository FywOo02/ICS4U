package Study.Unit3Test;

/**
 * @Author: Cho
 * @Date: 2022/05/09/20:54
 * @Description:
 */
public class PartB {
    public static int calculate(int n){
        if(n==1)
            return 1;
        return n+calculate(n-2);
    }

    public static void main(String[] args) {
        System.out.println(calculate(7));
    }
}
