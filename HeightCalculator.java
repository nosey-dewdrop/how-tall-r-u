public class HeightCalculator {

    // calculate height from phalanx length
    public static double calculateFromPhalanx(double phalanxLength, boolean isMale) {
        if (isMale) {
            return phalanxLength / 0.028;
        } 
        else {
            return phalanxLength / 0.027;
        }
    }

    // calculate height from thumb length  
    public static double calculateFromThumb(double thumbLength) {
        return thumbLength / 0.095;
    }

    // calculate height from humerus length (gender specific)
    public static double calculateFromHumerus(double humerusLength, boolean isMale) {
        if (isMale) {
            return (2.89 * humerusLength) + 78.10;
        } 
        else {
            return (2.75 * humerusLength) + 81.24;
        }
    }

    // calculate height from hand length
    public static double calculateFromHand(double handLength) {
        return handLength / 0.185;
    }

    // calculate height from foot length
    public static double calculateFromFoot(double footLength) {
        return footLength / 0.15;
    }

    // calculate height from shoe size (gender specific)
    public static double calculateFromShoeSize(double shoeSize, boolean isMale) {
        double footLength;
        if (isMale) {
            footLength = (shoeSize * 0.67) + 22.0;
        } 
        else {
            footLength = (shoeSize * 0.67) + 20.5;
        }
        return calculateFromFoot(footLength);
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