package controlflow.core;

public class SumOdd {

    public static void main(String[] args) {

        // System.out.println(isOdd(69));
        System.out.println(sumOdd(0, 10));
    }

    public static boolean isOdd(int number) {

        boolean ifOdd = false;

        if (number > 0) {
            if (number % 2 != 0) {
                ifOdd = true;
            }
        }

        return ifOdd;
    }

    public static int sumOdd(int start, int end) {

        int addOdd = 0;

        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    addOdd += i;
                }
            }
        } else {
            addOdd = -1;
        }
        return addOdd;
    }
}
