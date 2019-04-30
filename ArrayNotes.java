// Carrie Krueger
// 4-30-19
// All about arrays 

public class ArrayNotes {
    public static void main(String[] args) {
      
      
        /* template
        
              0   1   2   3   4   5   6
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------
        */ 
        
        
        // ARRAY RULES 
        // 
        // 1. You need to know the size of the array when you declare it 
        // 2. Once the size of the array is set, it can't change (you can't resize the array)
        // 3. Arrays can only hold one type of data at once (all ints, all Strings, etc.)
        // 4. Arrays are indexed from 0 to length - 1  (ArrayIndexOutOfBounds Exception) 
        
        // Let's make an array to hold daily temperatures for the week
        
        int[] temps = new int[7];   // DECLARE the array and set the length ([])
        
        /*  positions 0 to length-1 (6)
            initially filled with 0s
        
              0   1   2   3   4   5   6
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------
        */ 
        
        // loading the array with values
        
        temps[0] = 29;
        temps[1] = 31;
        temps[2] = 41;
        temps[3] = 16;
        temps[4] = 30;
        temps[5] = 30;
        temps[6] = 30;
        
        /*  
        
              0     1    2    3   4    5    6
            ------------------------------------
            | 29 | 31 | 41 | 16 | 30 | 30 | 30 |
            ------------------------------------
        */ 
        
        
        System.out.println(temps[3]);  //16
        
        // can do anything with array elements that you can do with regular variables 
        
        double weekendAverage = (temps[0]+temps[1])/2.0;
        System.out.println("Weekend average temp: " + weekendAverage);
        
        
        temps[3] = 26;  // no output, just changes the value 
        
        /*  
        
              0     1    2    3   4    5    6
            ------------------------------------
            | 29 | 31 | 41 | 26 | 30 | 30 | 30 |
            ------------------------------------
        */ 
        
        System.out.println(temps[3]);  //26
        
        
        // An array for the monthly temps? Make an array of size 30 
        int[] monthlyTemps = new int[30];   // indexed from 0 to 29 
        
        
        // print first element in any array: position 0 
        
        System.out.println("First: " + temps[0]); // 29
        
        // print last element in this array: position 6 
        
        System.out.println("Last: " + temps[6]); // 30
        
        // position 7?
        
         //System.out.println("Last: " + temps[7]); // ArrayIndexOutOfBounds Exception 
         
         
        // print last element in ANY array: position: length - 1
        
        System.out.println("Last: " + temps[temps.length - 1]); // 30 
        
        // how to print entire array?
        System.out.println(temps);  // prints memory address... 
        
        
        // use a for loop to print every element in the array 
        
        for(int i = 0; i < temps.length; i++) {
            System.out.print(temps[i] + " ");
        }
        
        System.out.println();  // so the next thing will print on the next line
        
        // Arrays act just like Strings! 
        
        String s = "abcdefg";
        
        System.out.println(s.length());  // 7 ** length is a method for Strings, but a variable for arrays
        System.out.println(s.charAt(0)); // a
        //System.out.println(s.charAt(7)); // StringIndexOutOfBoundsException
        System.out.println(s.charAt(s.length()-1)); // g
        
        // sending an array to a method as a parameter 
        
        printArray(temps);
        
    }
    
    // this method takes and array and prints it out 
    
    public static void printArray(int[] a) {
        
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
