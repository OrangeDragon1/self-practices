package methodoverloading.core;

public class Duration {

    public static void main(String[] args) {
        
        System.out.println(getDurationString(76, 59));
        
        System.out.println(getDurationString(65987));
    }

    public static String getDurationString(int minutes, int seconds) {

        String output = "";
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            output = String.format("%dh %dm %ds", hours, remainingMinutes, seconds);
        } 
        return output;
    } 
    
    public static String getDurationString(int seconds) {
        
        String output = "";

        if(seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            
            output = getDurationString(minutes, remainingSeconds);
        } 
        
        return output;
    }
}
