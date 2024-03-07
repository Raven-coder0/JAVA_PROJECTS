package git_projects.git_projects_java.src.password_generator;
import java.security.SecureRandom;
import java.util.Scanner;



public class password_generator {
  private final static String char_set = "ABCDEFGHIJKLMNOPQURSTVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%";
    private final static SecureRandom random = new SecureRandom();

    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the password: ");
    int password_length = sc.nextInt();
    String password = generatepassword(password_length);
    System.out.println("The password: "+password);
    }

    
    private static String generatepassword(int length)
    {
        StringBuilder password = new StringBuilder();
        
        for(int i=0;i<length;i++)
        {
            char randomcharacter = char_set.charAt(random.nextInt(char_set.length()));
            password.append(randomcharacter);

            
        }
        return password.toString();
    }
    }
    

