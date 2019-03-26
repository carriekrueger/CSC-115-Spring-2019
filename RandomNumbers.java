// Carrie Krueger
// 3/26/19
// Using the Random class to make random numbers

import java.util.Random;
// use the premade Random class in Java 

public class RandomNumbers {
    public static void main(String[] args) {
        
        makeRandoms();  // method for making and printing random numbers
    }
    
    // this method looks at making random numbers in a range
    public static void makeRandoms() {
    
        // HOW TO MAKE RANDOM NUMBERS USING THE RANDOM CLASS 
        
        // Step 1: Instantiate (create) a Random object 
        // (make an instance of the Random class)
        // This is not the random number, but what we will use to get the number
        
        Random rand = new Random();
        
        // Step 2: use the .nextInt(int) method to generate a random number in a range
        // number generated is between 0 and parameter - 1 (exclusive of parameter)
        
        int randomNumber = rand.nextInt(100);    // gives a number 0-99
        System.out.println(randomNumber);
        
        // How to get a random number between 1 and 100?
        
        randomNumber = rand.nextInt(101);  // NOPE, gives 0 - 100 
        
        System.out.println(rand.nextInt(100) + 1);   // YES, gives 1-100
                                    //  0-99 + 1 = 1-100
        
        // How about a number between 75-100?
        
        System.out.println(rand.nextInt(26) + 75); 
                                    // 0-25 + 75 = 75 - 100
        
        
        
        // FORMULA or PATTERN????
        // Inside () = number of random numbers   (max # - min # + 1)
        // Added on outside = starting number (minimum number) 
        
        // How about a number between 20 and 50?
        
        System.out.println(rand.nextInt(31) + 20); 
                                     // 0-30 + 20 = 20 - 50 
    
        
    }
}
   
