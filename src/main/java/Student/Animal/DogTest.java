package Student.Animal;

public class DogTest extends Object implements Dog{
    String dogName;
    public DogTest(String dogName){
        this.dogName = dogName;
    }
    @Override
    public void walk() {
        System.out.println(dogName+" is walking");
    }

    @Override
    public void sleep() {
        System.out.println(dogName+" is sleeping");
    }

    @Override
    public void play() {
        System.out.println(dogName+" is playing");
    }
}
