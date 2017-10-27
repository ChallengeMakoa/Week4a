package Animal;

public class Dog {

    public String noise = "Woof woof";

    private int numberOfFleas = 5;

    protected String color = "brown";

    private int movement = 5;

    public static String name = "Tahlula";

    public void addFleas(int fleas) {
        if(fleas < 10)
        numberOfFleas = fleas;
    }

    public int getFleas() {
        return numberOfFleas;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
