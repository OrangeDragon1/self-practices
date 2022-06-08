package speedconverter.core;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        
        boolean isLeap = false;
        boolean range = (year >= 1 && year <= 9999);
        
        if(range) {
            
            if(year%4 == 0 && year%100 == 0 && year%400 == 0) {
                isLeap = true;
            } else if(year%4 == 0 && year%100 != 0) {
                isLeap = true;
            }
        
        }
        return isLeap; 
    }   
}
