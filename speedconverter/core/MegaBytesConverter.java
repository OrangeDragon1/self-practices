package speedconverter.core;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainKiloBytes = kiloBytes % 1024;

            System.out.printf("%d KB = %d MB and %d KB\n", kiloBytes, megaBytes, remainKiloBytes);
        }
    }
    
}
