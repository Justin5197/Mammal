package labFour;

public class Mammal {
    private int age;
    private double weight;

    Mammal(float weight, int age) {
        this.age = age;
        this.weight = weight;
    }

    public float getWeight() {
        return (float) weight;
    }

    public int getAge() {
        return age;

    }
}
