package labFour;

public class Student extends Human{

    private String major;
    private double gpa;
    private int creditHours;

    Student(float weight, int height, int age, String major, double gpa, int creditHours) {
        super(weight, age, height);

        this.major = major;
        this.gpa = gpa;
        this.creditHours = creditHours;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }


    public String getYear() {
        if (creditHours < 32) {
            return "Freshman";
        }

        if ((creditHours > 32) && (creditHours < 64)) {
            return "Sophmore";
        }

        if ((creditHours > 64) && (creditHours < 96)) {
            return "Junior";
        }

        else {

            return "Senior";
        }
    }
}