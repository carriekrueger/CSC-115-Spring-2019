// Carrie Krueger
// 3/12/19
// Notes on While Loops

public class WhileLoops {
    public static void main(String[] args) {
        
        loops();  // looking at while loops
    }
    
    // this method will explore while loops 
    public static void loops() {
        
        // Ask a question once: if/else statement 
        // Ask a question repeatedly: loop (while loop) 
        
        // LOOP RULES:
        
        // When you program a loop, you should know that it will 
        // DEFINITELY end once some condition has occurred 
        
        // Usually you have to increment some variable 
        // so that the loop will approach the end state 
        // LCV (loop control variable) 
        
        // WAYS TO INCREMENT A VARIABLE (3.7 textbook)
        
        int count = 0;
        // How to add 1?
        
        count = count + 1; // add 1 and save the result to count 
        
        count += 1; // compound operator (shortcut!)
        count++; // another common way to increment by 1 
        
        // Use curly braces around the while loop code!!!!
        
        // HERE COMES A LOOP 
        
        int counter = 0;
        
        while(counter != 5) {   // ends when the value of counter is 5
            
            counter += 1;    // increment loop control variable
            System.out.println(counter);
        }
        
        // how many times does this loop run?  5
        // can adjust the start/end/increment values...
        
        int num = 0;
        
        while(num < 3) {
            
            System.out.println(num);
        }
        
        // INFINITE LOOP OF DOOM
        // Ctrl+z in the terminal to exit the program
        
        // Live Code demos in Blackboard
        // while loop with a predictable number of iterations
        // while loop where you don't know when the loop will end (up to the user)
        

    }
}
