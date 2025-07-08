public class Person {
    private String gender;
    private double estimatedHeight;

    // Default constructor - initializes as male
    public Person() {
        this.gender = "male";
        this.estimatedHeight = 0.0;
    }

    // constructor with gender parameter
    public Person(String gender) {
        this.gender = gender;
        this.estimatedHeight = 0.0;
    }

    // getter and Setter methods
    public String getGender() {
        return gender;
    }

    public double getEstimatedHeight() {
        return estimatedHeight;
    }

    public void setEstimatedHeight(double estimatedHeight) {
        this.estimatedHeight = estimatedHeight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // helper methods - gender checking
    public boolean isMale() {
        return "male".equalsIgnoreCase(gender);
    }

    public boolean isFemale() {
        return "female".equalsIgnoreCase(gender);
    }

    @Override
    public String toString() {
        return 
        "gender: " + gender +
        "\nestimated height: " + estimatedHeight + " cm" +
        "\naccuracy: " + HeightCalculator.getAccuracyRange("phalanx");
    }


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
    }
}