// Carrie Krueger
// 4-9-19
// Partial code for passwordValidate() method from Password Program (does not compile/run)

public class PasswordValidateNotes {
    public static void main(String[] args) {
        
        // sample main method code 
        // input is the password the user typed in to check
        
        if(verifyPasswordSpecifications(input) == true) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
        
    }
    
    public static boolean verifyPasswordSpecifications(String input) {
        
        // at least 8 characters 
        // 1 capital letter
        // 2 numbers 
        
        
        // check length 
        
        if(input.length() < 8) {
            return false;   // method ends as soon as it hits a return 
        }
        
        // check for 1 capital letter 
        
        int counter = 0;
        int capitalCounter = 0;
        
        while(counter < input.length()) {
            
            char ch = input.charAt(counter);
            
            if(ch >= 'A' && ch <= 'Z'){
                capitalCounter++;
            }
            
            counter++;
        }
        
        // check for 2 numbers 
        // FINISH THIS CODE HERE 
        
        
        if(capitalCounter >= 1 && numberCounter >= 2) {
            return true;
        }
        return false;

        
    }
}
