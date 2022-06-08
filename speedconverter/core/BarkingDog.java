package speedconverter.core;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean wakeUp = false;

        if((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24)) {
            if(barking) {
                wakeUp = true;
            } else {
                wakeUp = false;
            }
        }
        return wakeUp;
    }
}
