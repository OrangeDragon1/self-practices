package controlflow.core;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        // System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(10, 2020));
    }

    public static boolean isLeapYear(int year) {

        boolean isLeap = false;
        boolean range = year >= 1 && year <= 9999;
        String divisible = "no";

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            divisible = "yes";
        }

        if (range) {
            switch (divisible) {
                case "yes":
                    isLeap = true;
                    break;

                default:
                    break;
            }
        }

        return isLeap;

    }

    public static int getDaysInMonth(int month, int year) {

        int numDays = -1;

        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;

                case 2:
                    if (isLeapYear(year)) {
                        numDays = 29;
                    } else {
                        numDays = 28;
                    }
                    break;

                default:
                    break;
            }

        }
        return numDays;
    }
}
