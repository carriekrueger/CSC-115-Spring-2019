/* Carrie Krueger
   4-2-19
   A menu of math to demonstrate methods.
   Ask the user for two numbers, perform the chosen operation, and display the result.
   
   Every method should have a COMMENT DESCRIPTION of does, + additional comments throughout as needed.

*/

import java.util.Scanner;

public class MethodDemo {
    
    public static void main(String[] args) {
        
        // Main method runs the program (major steps --> methods)
        // Keep Scanner and user input in here to make it easier 
        
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for two numbers 
        int num1;
        int num2;
        
        System.out.println("Enter number 1:");
        num1 = sc.nextInt();
        
        System.out.println("Enter number 2:");
        num2 = sc.nextInt();
        
        // Display menu of options 
        // This method is a CODE DISPLACEMENT method (it's void) 
        
        showMenu();
        
        // Get user's choice 
        // Could make another code displacer (same for above input), but Scanner scope issues 
        
         System.out.println("Enter your choice:");
         int choice = sc.nextInt();
         
         //  do the thing they want to do by calling the appropriate method 
         
         // Where are the dots?? Don't need dot possession if your method is 
         // DEFINED in the same class where it is CALLED 
         
         if(choice == 1) {
             add(num1, num2);  // a method that shows how PARAMETERS/ARGUMENTS work
         }
         
         if(choice == 2) {
             divide(num1, num2); // more parameters 
         }
         
         if(choice == 3) {
             
            int answer = square(num1);  // returning a value and saving it to a variable 
            System.out.println(answer);
         }
         
         if(choice == 4) {
             System.out.println("The exponentiation is: " + exp(num1, num2));  // returning to a print statement
         }
    
        sc.close();
    }
    
    
    // this method displays a menu of options 
    public static void showMenu() {
        
        System.out.println("\nPlease choose from the following:");
        System.out.println("\t1. Add the two numbers");
        System.out.println("\t2. Divide the two numbers");
        System.out.println("\t3. Square the first number");
        System.out.println("\t4. Exponentiate the two numbers");
        
        System.out.println();
    }
    
    // This method takes two integers and displays the sum 
    
    // NOTE: parameters (variables) catch the arguments (values) sent to the method 
    
    public static void add(int a, int b) {
        
        System.out.println("The sum of " + a + " + " + b + " is " + (a + b));
    }
    
    // This method takes two integers and displays the quotient 
    public static void divide(int a, int b) {
        
        if(b == 0) {
            System.out.println("You can't divide by zero!");
        } else {
            System.out.println("The quotient of " + a + " / " + b + " is " + (1.0*a / b)); // int division
        }
    }
    
    // This method takes and integer and returns the square of it 
    public static int square(int a) {
        int ans = a * a; 
        return ans;
        
        // return a * a;    // shorter 
    }
    
    // This method takes two ints and returns a raised to the b power 
    public static int exp(int a, int b) {
        // return Math.pow(a, b);         // cheat code... would need to change return type to double 
        
        int counter = 1;
        int answer = 1;
        
        while(counter <= b) {
            answer *= a;
            counter++;
        }
        
        return answer;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
