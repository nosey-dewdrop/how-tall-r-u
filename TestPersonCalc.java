public class TestPersonCalc {

    public static void main(String[] args) {
        
        Person person1 = new Person();
        
        // test phalanx calculation
        double phalanxLength = 7.5; // cm
        double calculatedHeight = HeightCalculator.calculateFromPhalanx(phalanxLength, person1.isMale());
        
        // store result in person object
        person1.setEstimatedHeight(calculatedHeight);
        
        System.out.println("phalanx length: " + phalanxLength + " cm");
        System.out.println(person1.toString());
        
        System.out.println("-------- second person! ---------");
        
        Person person2 = new Person("female");
        double sameCalculation = HeightCalculator.calculateFromPhalanx(phalanxLength, person2.isMale());
        person2.setEstimatedHeight(sameCalculation);
        
        System.out.println("same phalanx for female:");
        System.out.println("calculated height: " + person2.getEstimatedHeight() + " cm");
        System.out.println("difference: " + Math.abs(person1.getEstimatedHeight() - person2.getEstimatedHeight()) + " cm");
        
        System.out.println("-------------------");
        
        // Test multiple calculations for same person
        testMultipleCalculations();
    }
    
    public static void testMultipleCalculations() {
        Person testPerson = new Person("male");
        System.out.println("Testing multiple calculations for " + testPerson.getGender() + ":");
        
        // different body measurements for same person
        double thumbLength = 6.0; // cm
        double handLength = 18.5; // cm
        double footLength = 27.0; // cm
        
        double heightFromThumb = HeightCalculator.calculateFromThumb(thumbLength);
        double heightFromHand = HeightCalculator.calculateFromHand(handLength);
        double heightFromFoot = HeightCalculator.calculateFromFoot(footLength);
        
        System.out.println("height from thumb: " + String.format("%.1f", heightFromThumb) + " cm");
        System.out.println("height from hand: " + String.format("%.1f", heightFromHand) + " cm");
        System.out.println("height from foot: " + String.format("%.1f", heightFromFoot) + " cm");
        
        // calculate average
        double average = (heightFromThumb + heightFromHand + heightFromFoot) / 3;
        testPerson.setEstimatedHeight(average);
        
        System.out.println("average height: " + String.format("%.1f", testPerson.getEstimatedHeight()) + " cm");
    }
}