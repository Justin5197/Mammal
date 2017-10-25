package labFour;

public class Doctor extends Human {

    private int years;
    private String Specialty;

    Doctor(float weight, int height, int age, int years, String Specialty) {
        super(weight, age, height);

        this.years = years;
        this.Specialty = Specialty;
    }

    public int getYears() {
        return years;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public int getSalary() {
        return 40000 + (years - 1) * 5000;
    }
}

