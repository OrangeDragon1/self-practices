package speedconverter.core;

public class TeenNumberChecker {

    public static boolean hasTeen(int teen1, int teen2, int teen3) {
        
        boolean hasTeen1 = teen1 >= 13 && teen1 <= 19;
        boolean hasTeen2 = teen2 >= 13 && teen2 <= 19;
        boolean hasTeen3 = teen3 >= 13 && teen3 <= 19;

        if (hasTeen1 || hasTeen2 || hasTeen3) {
            return true;
        } else
            return false;
    }
    
    public static boolean isTeen(int teenAge) {
        
        if (teenAge >= 13 && teenAge <= 19) {
            return true;
        } else
            return false;
    }
}
