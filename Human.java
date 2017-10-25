package labFour;

public class Human extends Mammal {

    private int height;

    Human(float weight, int age, int height) {
        super(weight, age);

        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}