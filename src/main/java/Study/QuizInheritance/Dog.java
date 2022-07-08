package Study.QuizInheritance;

/**
 * @Author: Cho
 * @Date: 2022/04/21/21:52
 * @Description:
 */
public class Dog extends Animal{
    public Dog() {
        super("day");
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating.");
    }
}
