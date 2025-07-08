public class Person {
    private String gender;
    private double estimatedHeight;

    private String measurementType = "";
    private String accuracy = "";
    
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
    
        public String getHeightInFeetAndInches() {
            double totalInches = estimatedHeight / 2.54;
            int feet = (int) (totalInches / 12);
            int inches = (int) (totalInches % 12);
            return feet + "' " + inches + "\"";
        }
    
        // helper methods - gender checking
        public boolean isMale() {
            return "male".equalsIgnoreCase(gender);
        }
    
        public boolean isFemale() {
            return "female".equalsIgnoreCase(gender);
        }
    
        
        // getter and Setter methods
        public String getGender() {
            return gender;
        }
    
        public double getEstimatedHeight() {
            return estimatedHeight;
        }
    
        public String getMeasurementType(){
            return measurementType;
        }
    
        public String getAccuracy(){
            return accuracy;
        }
    
        public void setEstimatedHeight(double estimatedHeight) {
            this.estimatedHeight = estimatedHeight;
        }
    
        public void setGender(String gender) {
            this.gender = gender;
        }
    
        public void setMeasurementType(String type){
            this.measurementType = type;
    }

    public void setAccuracy(String accuracy){
        this.accuracy = accuracy ;
    }

    @Override
    public String toString() {
        return 
        "gender: " + gender +
        "\nmeasurement type: " + measurementType +
        "\nestimated height: " + estimatedHeight + " cm" +
        "\naccuracy: " + accuracy;
    }


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
    }
}