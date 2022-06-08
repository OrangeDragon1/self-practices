package controlflow.core;

public class Switch {
    
    public static void main(String[] args) {
        char input = 'D';

        switch (input) {
            case 'A':
                System.out.printf("This is input %c.\n", input);
                break;
            
            case 'B':
                System.out.printf("This is input %c.\n", input);
                break;

            case 'C': case 'D':case 'E':
                System.out.printf("This is input %c.\n", input);
                break;    


            default:
                break;
        }
    }
}
