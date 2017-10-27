import Animal.Cat;
import Animal.Dog;

public class Main {

    //class variable or instance variable
    //four types of variable declarations
    //public, private, protected, or package private
    public static String publicString;
    public static int publicInt;

    public double lengthOfTail = 5.0;

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.lengthOfTail);

        Cat cat = new Cat();
        System.out.println(cat.getNoise());
        Dog.name = "Fluffy";

        Dog dog = new Dog();
        System.out.println("In Main: " + dog.getName());
        System.out.println("In Main: " + dog.getColor());

    }
}
