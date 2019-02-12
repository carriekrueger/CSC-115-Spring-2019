/* Carrie Krueger
   2/12/19
   How to use a Scanner to read input from the Keyboard
*/

import java.util.Scanner;
// To read from the Keyboard, use a premade Java class (Scanner)
// Certain premade classes need to be imported to be used
// Scanner: yes      Math and String: no


public class KeyboardInput {
    
    public static void main(String[] args) {
        
        readInput(); // read input from the keyboard
    }
    
    // a method that will read input from the Keyboard
    
    public static void readInput() {
        
        String name;
        int age;
        
        // INSTANTIATE (create) a Scanner that reads from the Keyboard
        // This makes a Scanner called 'sc'
        
        Scanner sc = new Scanner(System.in);
        // ^ Why sc? could have done anything...
        // descriptive variable names help
        
        // Prompt user for information
        // use the .nextLine() method to read from the Keyboard and store text 
        
        System.out.println("Please enter your full name:");
        name = sc.nextLine();   // reads in line of text and stores it 
    
        // Scanners have methods to read all types of data
        // until it gets to a space or a new line
        // to read an int: use .nextInt()
        
        System.out.println("Enter your age:");
        age = sc.nextInt();  // reads and stores an int
        
        
        // Echo [concatenation]
        System.out.println("Hello, " + name + ". How does it feel to be " + age + "?");
        
        sc.close();  // close the Scanner (makes the compiler happy, useful later)

    }
}
