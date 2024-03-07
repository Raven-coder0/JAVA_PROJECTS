package password_generator;

import java.util.Scanner;
import java.security.SecureRandom;

public class password_generator_2 {

    public String generatePassword(int length) {
        String pwd_characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = pwd_characters.charAt(random.nextInt(pwd_characters.length()));
            password.append(randomChar);
        }

        return password.toString();
    }
    public static void main(String[] args) {
        password_generator_2 generator = new password_generator_2();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the length of the password: ");
        int passwordLength = sc.nextInt();
        String password = generator.generatePassword(passwordLength);
        System.out.println("______________________________________________");
        System.out.println();
        System.out.println("The Password: " + password);
        System.out.println("______________________________________________");
    }
    
}
    