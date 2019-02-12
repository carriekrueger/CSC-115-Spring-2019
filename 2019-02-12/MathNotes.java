/* Carrie Krueger
   2/12/19
   Notes on math, casting, constants (Ch. 3); Math, rounding (Ch. 4)
*/

public class MathNotes {
    
    public static void main(String[] args) {
        
        doMath(); // let's do some math
    }
    
    // a method to do math things
    
    public static void doMath() {
        
        // Division
        
        System.out.println(5/2);   // 2
        System.out.println(5.0/2); // 2.5
        
        int num1 = 60;
        int num2 = 50;
        
        System.out.println(num1/num2);  // exact?
        System.out.println(1.0*num1/num2);  // works (introduce a DOUBLE LITERAL)
        System.out.println((double)num1/num2);  // the right way: CASTING
        // casting is temporarily turning a variable into another type
        // PEMDAS at work...
        System.out.println((double)(num1/num2)); // nope- cast too late
        
        // Casting TRUNCATES (doesn't round)
        
        double pay = 500.92;
        System.out.println((int)pay);  // 500 or 501?  500
        
        pay = 99.9999999999;
        System.out.println((int)pay);  // 99
        
        
        // What if we wanted to round?
        // Math: a premade Java class (like String)
        // many useful methods that do math things
        // access by doing Math.______
        // can send information/variables in the ()
        
        // round: Math.round(double num)
        // returns (gives) a long, need to cast to an int
        
        
        int roundedPay = (int)Math.round(pay);  // error without the cast
        System.out.println(roundedPay);
        
        // CONSTANTS (constant variables)
        // a variable whose value is set once and can't change 
        // proper formatting: all caps, keyword final 
        
        final int NUMBER_OF_STUDENTS = 18;
        
        double TAX_RATE = 0.08;  // not totally correct
        
        // Math -> built in constants 
        
        System.out.println(Math.PI);
        

        
        
    }
}
