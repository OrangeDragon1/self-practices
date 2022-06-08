package speedconverter.core;

public class EqualSumChecker {

    public static boolean hasEqualSum(int val1, int val2, int val3){

        int val4 = val1 + val2;
        boolean ifEquals = false;

        if(val4 == val3) {
            ifEquals = true;
        }

        return ifEquals;
    }
    
}
