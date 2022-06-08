package methodoverloading.core;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(-1);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hours = (int) (minutes / 60);
            int minutesRemaining = (int) minutes % 60;
            int days = hours / 24;
            int hoursRemaining = hours % 24;
            int years = days / 365;
            int daysRemaining = days % 365;

            System.out.printf("%d min = %d y and %d d\n", minutes, years, daysRemaining);
        }
    }
}
