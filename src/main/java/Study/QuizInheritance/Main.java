package Study.QuizInheritance;

/**
 * @Author: Cho
 * @Date: 2022/04/21/21:56
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Animal");
        System.out.println(animal.getName());
        animal.eat();

        Animal dog = new Dog();
        dog.setName("Happy");
        System.out.println(dog.getName());
        dog.eat();
    }
}
