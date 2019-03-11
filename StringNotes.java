/* Carrie Krueger
   2-28-19
   Some things we can do with Strings 
*/

public class StringNotes {
    public static void main(String[] args) {
        
        stringThings(); // things we can do with Strings
    }
    
    // this method looks at Strings 
    
    public static void stringThings() {
        
        /*  primitives (int, double, etc. )
            vs. classes/objects  (Scanner, Math, String)  (Ch. 4)
            
            objects have methods that can do things 
            ex. sc.nextInt(), Math.round(num) 
            
            We've used Strings like primitives, but they can do so much more!
        */
        
        String name = "Grace";
        System.out.println("name = " + name); // name = Grace
        
        System.out.println(); // prints a blank line
        
        // length() returns (gives) the length of the String
        // the number of characters
        
        System.out.println(name.length());  // 5
        
        System.out.println();
        
        // Strings are indexed from 0 to length-1
        
        // charAt(position) returns the character at that index 
        System.out.println(name.charAt(0)); // G 
        System.out.println(name.charAt(4));  // e 
        //System.out.println(name.charAt(5)); // out of bounds error 
        
        System.out.println();
        
        // lots of methods that are helpful for standaradizing user input 
        
        // toUpperCase() returns the String in all UPPERCASE  
        System.out.println(name.toUpperCase()); // GRACE 
        
        // toLowerCase() returns the String in all lowercase 
        System.out.println(name.toLowerCase()); // grace 
        
        System.out.println();
        
        // trim gets rid of leading and trailing whitespace
        name = "    Grace    ";
        System.out.println(name); //     Grace   
        System.out.println(name.trim()); // Grace 
        
        // to actually change the value of the String, 
        // reassign it using = operator
        
        //name = name.trim();
        name = name.toUpperCase().trim(); 
        System.out.println(name); // GRACE 
        
        System.out.println();
        
        String s1 = "Star Trek";
        String s2 = "Star Wars";
        
        // substring(position) returns a part of the String 
        // goes from position to the end 
        System.out.println(s1.substring(5)); // Trek 
        
        // substring(start, end) return a part of the String 
        // goes from start to end - 1 (end is not included)
        
        System.out.println(s2.substring(5, 8)); // War 
        
        System.out.println();
        
        // indexOf(character) returns the first index of the character 
        // in the String 
        System.out.println(s1.indexOf('T')); // 5
        System.out.println(s1.indexOf('Z')); // -1
        
        // indexOf(String) returns the first index of the String
        // in the String 
        System.out.println(s2.indexOf("War")); // 5
        
        System.out.println();
        
        // comparing two Strings: DON'T USE == 
        // .equals 
        
        System.out.println(s1.equals(s2)); // false 
        System.out.println(s2.equals(s2)); // true 
        
        String s3 = "STAR TREK";
        
        System.out.println(s1.equalsIgnoreCase(s3)); // true 
        
        
        
    }
}
