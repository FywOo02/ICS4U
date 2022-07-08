package Study.Inheritance;

/**
 * @Author: Cho
 * @Date: 2022/04/21/21:33
 * @Description:
 */
public class Son extends Father{
    public Son() {
        this(20);
        System.out.println("I am the son");
    }
    public Son(int num2){
        System.out.println("I am num2"+num2);
    }
}
