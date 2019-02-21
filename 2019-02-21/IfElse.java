// Carrie Krueger
// 2/21/19
// Notes on If/Else Statements 

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        ifMethod();  // looking at if statements 
    }
    
    // this method will explore if-else statements 
    public static void ifMethod() {
        
        // Task: ask the user for a number and tell them if it's even 
        
        Scanner sc = new Scanner(System.in); // make a Scanner that 
                                             // reads from the KeyboardInput
                                             
        System.out.println("Enter a number:"); //  get a number from the user 
        int number = sc.nextInt();  // read and store user's number 
        
        /* Three common mistakes:
        
           1. DON'T put a ; after the if()
           2. DO put curly braces { } around the code to be executed if true 
           3. DO remember to test for equality with '=='
        */
        
        if(number % 2 == 0) {      // test for evenness with mod
             
            System.out.println(number + " is even!");
            System.out.println("Hooray!");
        }
        
        System.out.println("The end.");   // print every time
        
        // Task: compare two numbers 
        
        int num1 = 2;
        int num2 = 13;
        
        if(num1 < num2)  {    // compare and output a message
            
            System.out.println("num1 is less!");
            
        } else {
            
            System.out.println("num1 is NOT less!");
        }
        
        sc.close();

        
        
    }
}
