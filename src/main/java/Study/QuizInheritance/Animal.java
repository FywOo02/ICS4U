package Study.QuizInheritance;

/**
 * @Author: Cho
 * @Date: 2022/04/21/21:51
 * @Description:
 */
public class Animal {
    private String name;
    public  Animal(){
        name = " ";
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
}
