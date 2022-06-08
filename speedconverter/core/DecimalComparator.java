package speedconverter.core;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {
        
        boolean ifEqual = false;

        int threeDOne = (int)(val1*1000);
        int threeDTwo = (int)(val2*1000);

        if (threeDOne == threeDTwo) {
            ifEqual = true;
        }
        return ifEqual;
    }
    
}
