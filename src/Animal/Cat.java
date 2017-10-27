package Animal;

public class Cat {

    String noise = "Meow";
    private int movement = 3;

    public String getNoise() {
        messWithDog("purple");
        return noise;
    }

    public void messWithDog(String newColor) {
        Dog dog = new Dog();
        dog.color = newColor;
        System.out.println(dog.color);
        System.out.println("dogs name is " + Dog.name);
        System.out.println("messWithDog: color is " + dog.getColor());
    }

}
