package git_projects.git_projects_java.src.password_generator;
import java.util.Scanner;
import java.security.SecureRandom;  // Import the SecrureRandom package
// Here we are using 'SecureRandom' instead of 'Random' for more secure password 



public class password_generator {
  private final static String char_set = "ABCDEFGHIJKLMNOPQURSTVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%";
    private final static SecureRandom random = new SecureRandom();

    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//Taking input from an user using Scanner 
    System.out.println("Enter the length of the password: ");
    int password_length = sc.nextInt();

// Calling an method from an Variable
    String password = generatepassword(password_length);

 // Lets print the generated password
    System.out.println("The password: "+password);
    }

// Create an method with a length parameter    
    private static String generatepassword(int length)
    {

// StringBuilder to efficiently build the password character by character
        StringBuilder password = new StringBuilder();
        
        for(int i=0;i<length;i++)
        {

// Generate an random index from the length of the pwd_characters
            char randomcharacter = char_set.charAt(random.nextInt(char_set.length()));

// append the generated random characters into 'password' 
            password.append(randomcharacter);

            
        }
// Returning password as an proper String  
        return password.toString();
    }
    }
    
