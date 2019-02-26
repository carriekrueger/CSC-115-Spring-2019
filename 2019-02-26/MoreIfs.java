/* Carrie Krueger
   2-26-2019
   Efficiently using if statements and multiple conditionals
*/

import java.util.Scanner;

public class MoreIfs {
    public static void main(String[] args) {
        
        betterIfs(); // efficient using if-statements
        multiples(); // multiple conditionals
    }
    
    // this method shows the preferred way to handle code that is being reused
    public static void betterIfs() {
        
        
        // PREFERRED WAY 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        if(age >= 65) {
            
            System.out.println("Age is just a number!");
           
        }
        
        System.out.println(age + " is a good age.");
        
        /*
        
        LESS PREFERRED WAY
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        if(age >= 65) {
            
            System.out.println("Age is just a number!");
            System.out.println(age + " is a good age.");
        }
        
        if(age < 65) {
            
             System.out.println(age + " is a good age.");
        }
        
        */
    }
    
    // this method looks at multiple conditionals 
    public static void multiples() {
        
        int num = 9;
        
        if(num >= 30 && num <= 50) {  // boolean logic operator, short-circuit
            System.out.println("Number is in range!");
        }
        
        // let's compare num to 10 in a better way than we did before 
        // multiple ways to handle multiple conditionals
        
        // only one outcome possible
        // NESTED 
        // notice the indenting: every time if/else/{ --> next line indented
        if(num > 10) {
            System.out.println("Greater!");
        } else {
            if(num < 10) {
                System.out.println("Less!");
            } else {
                System.out.println("Equal!");
            }
            
        }
        
        // only one outcome possible
        // neater nesting
        
        if(num > 10) {
            System.out.println("Greater!");
        } else if(num < 10) {
            System.out.println("Less!");
        } else {
            System.out.println("Equal!");
        }
        
        // more than one outcome possible
        num = 101;
        if(num > 10) {
            System.out.println("Greater!");
        }
        if(num > 100) {
            System.out.println("really big number!!!");
        }
        
        /* Another option: SWITCH STATEMENTS 
           Textbook 6.3
           Pros and Cons:
           - if/else statements can handle ranges 
           - switch statements can only handle exact values 
           - switch statements can only be used with certain primitives and String
           - if/else can get messy with { }, more prone to logical errors 
             (also syntax)
        */
        
        
        

        
    }
  
    
}
