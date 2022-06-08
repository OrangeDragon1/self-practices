package practice01.core;

public class BooleanOperator {

    public static void main(String[] args) {
        double val1 = 20;           
        double val2 = 80;           

        double val3 = (val1+val2) * 100;
        System.out.printf("(%.2f + %.2f) * 100 = %.2f\n",val1,val2,val3);         
        double val4 = val3%67;          
        System.out.printf("%.2f mod 40 = %.2f\n",val3,val4);

        boolean remainder;          

        if(val4==0) {           
            remainder = true;           
        } else {            
            remainder = false;
        }

        System.out.printf("Is remainder zero? %b\n",remainder);
        
    }
}