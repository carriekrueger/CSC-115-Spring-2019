// Carrie Krueger
// 2-7-19
// Notes about variables and String output 

public class Variables {
    public static void main(String[] args) {
        
        variables();    // a method to investigate variables
        aboutStrings(); // a method to investigate Strings 
    }
    
    // this method will look at variables 
    public static void variables() {
        
        /* A variable is a place store a value.
           A variable holds data.
           A variable is a named location in the computer's memory.
           
           There are a few different kinds of information we can store:
           
           integer(whole number):   int 
           decimal(3.14, -6.0):     double 
           boolean(true, false):    boolean 
           character('a', '3', '?'):   char 
           
           Other types: long, short, float, byte 
           PRIMITIVE DATA types
           
        */   
           // When you want to use a variable: declare
           // DECLARE a variable called 'age' that holds
           // a whole number (integer)
           
           int age;
           
           
           // variable names start with a lowecase and follow camelCase
           // method names follow this as well
           // classes start with an uppercase letter
           
           // when you want to give your variable a value: assign using =
           // ASSIGN the variable 'age' a value of '36'
           
           age = 36;
           
           
           // You can do both at once!
           // DECLARE a variable name 'gpa' that holds
           // a decimal and ASSIGN it at the same time 
           
           double gpa = 3.14;
           
           
           // DISPLAY the current value of your variables 
           
           System.out.println("Your age is " + age + ".");
           System.out.println("Your gpa is " + gpa);
           
           // Reassign the value of 'gpa'
           
           gpa = 2.718; 
           System.out.println("Your gpa is now " + gpa);

           
           // More examples
           
           
           // int       num      =  28;
           // type
           //           name 
           //                       value
           
           
           int num1 = 4;
           int num2 = 9;
           
           // you can do stuff with variables -> print, Math
           
           int sum = num1 + num2;
           System.out.println(sum); // 13
           
           
           int x;                   // x has been DECLARED but not ASSIGNED
                                    // (not been initialized)
           
           
           //System.out.println(x);   // error! won't work
           
           
           // In your Quotes class (or new class)
           // Declare 2 int variables 
           // Assign them values
           // Print out the sum and the product
           
    }
    
    // in this method we will look at Strings 
    public static void aboutStrings() {
        
        // STRING 
        // A variable that hold a bunch of characters (like a word) 
        // String is a class (note the uppercase), but we can use it like a 
        // primitive 
        
        String firstName = "Carrie";    // note the camelCase 
        System.out.println(firstName + " " + "Krueger"); // CONCATENATE
        
        // Mixing Strings and numbers is a tricky business
        
        System.out.println("3 + 4");
        System.out.println(3 + 4);
        System.out.println(3 + 4 + " = 3 + 4");
        System.out.println("3 + 4 = " + 3 + 4);
        System.out.println(3 + 4 + " = 3 + 4 = " + 3 + 4);
        System.out.println(3 + 4 + " = 3 + 4 = " + (3 + 4));  // fix with ()
                                                              // order of ops
                                                              
        System.out.println(3 - 4);      
        //System.out.println("3 - 4 = " + 3 - 4);  // error!
        System.out.println("3 - 4 = " + (3 - 4));
        
        int difference = 3 - 4;
        System.out.println(difference);
    }
    
}
