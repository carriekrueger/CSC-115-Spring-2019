// Carrie Krueger
// 2/5/19
// Chapter 2 Notes: Output and Escape Sequences

public class Ch2OutputAndEscape {
    public static void main(String[] args) {
        
        escape(); // this method will explore output and escape sequences
    }
    
    // a method to investigate output and escape sequences
    public static void escape() {
        
        // print vs println
        
        System.out.print("Hello class!");  // next thing prints on same line
        System.out.println("It's Tuesday."); // next thing prints on next line
        System.out.print("Better than Monday!");
        System.out.println();  // prints blank line
        
        // output 
        System.out.println(2);  // you can put text or numbers in the print
        System.out.println(1 + 2 * 3);  // you can do math too
        
        // ESCAPE sequences 
        // special characters denoted with a \ (the escape character)
        
        // \n -> newline
        
        System.out.print("Hello! \n\n\n\n");
        System.out.println("He\nllo");
        
        // \t -> tab 
        System.out.println("Hi\tHi\tHI");
        
        // \\ -> \
        
        System.out.println("\\");
        
        // \" -> "
        
        System.out.println("She said \"Java is the best!!\"");
        
        // \' -> '
        System.out.println("\'");
        
        
        // You try!
        
        // Think of a quotation or saying that you know
        // Create a class named Quotes that outputs the saying 
        // with visible quotation marks in the output.
        
        // Example output: "That's the way the cookie crumbles."
        
        // Use a method to print your quote!
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
