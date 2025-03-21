package password_generator;
import java.util.Scanner; 
import java.security.SecureRandom; // Import the SecrureRandom package
// Here we are using 'SecureRandom' instead of 'Random' for more secure password 

public class password_generator_2 {

// Create an method with a length parameter
    public String generatePassword(int length) {   
        String pwd_characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
        SecureRandom random = new SecureRandom();

// StringBuilder to efficiently build the password character by character
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {

// Generate an random index from the length of the pwd_characters
            char randomChar = pwd_characters.charAt(random.nextInt(pwd_characters.length()));

// append the generated random characters into 'password' 
            password.append(randomChar);
        }

// Returning password as an proper String  
        return password.toString();
    }
    public static void main(String[] args) {

// Create an object for an public class
        password_generator_2 generator = new password_generator_2();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the length of the password: ");  // Take the 
        int passwordLength = sc.nextInt();

// Calling an method using object with an Variable
        String password = generator.generatePassword(passwordLength);
        System.out.println("______________________________________________");
        System.out.println();
        System.out.println("The Password: " + password);  // Lets print the generated password
        System.out.println("______________________________________________");
    }
    
}
    
