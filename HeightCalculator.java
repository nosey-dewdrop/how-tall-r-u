public class HeightCalculator {

    // calculate height from phalanx length
    public static double calculateFromPhalanx(Person person, double phalanxLength ) {
        
        person.setMeasurementType("from phalanx");
        String gender = person.getGender();

        if (gender.equals("male")) {
            return phalanxLength / 0.028;
        } 
        else {
            return phalanxLength / 0.027;
        }
    }

    // calculate height from thumb length  
    public static double calculateFromThumb(Person person, double thumbLength) {
        person.setMeasurementType("from thumb");
        return thumbLength / 0.095;
    }

    // calculate height from humerus length (gender specific)
    public static double calculateFromHumerus(Person person, double humerusLength ) {
        
        person.setMeasurementType("from humerus");
        String gender = person.getGender();

        if (gender.equals("male")) {
            return (2.89 * humerusLength) + 78.10;
        } 
        else {
            return (2.75 * humerusLength) + 81.24;
        }
    }

    // calculate height from hand length
    public static double calculateFromHand(Person person, double handLength) {
        person.setMeasurementType("from hand");
        return handLength / 0.185;
    }

    // calculate height from shoe size (gender specific)
    public static double calculateFromShoeSize(Person person, double shoeSize) {

        person.setMeasurementType("from shoe");
        String gender = person.getGender();
        double footLength;

        if (gender.equals("male")) {
            footLength = (shoeSize * 0.67) + 22.0;
        } 
        else {
            footLength = (shoeSize * 0.67) + 20.5;
        }
        return footLength / 0.15;
    }

    // get accuracy range for each measurement type
    public static String getAccuracyRange(String measurementType) {
        switch (measurementType.toLowerCase()) {
            case "phalanx":
                return "±4-6 cm";
            case "thumb":
                return "±5-7 cm";
            case "humerus":
                return "±2-3 cm";
            case "hand":
                return "±3-5 cm";
            case "foot":
                return "±4-6 cm";
            case "shoe":
                return "±6-10 cm";
            default:
                return "±5 cm";
        }
    }
}