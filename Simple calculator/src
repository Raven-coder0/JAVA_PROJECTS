import java.util.Scanner;  // importing the scanner from java.util

class simplecalculator{   // Creating a class
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in); // Creating an object for userinput.

        while(true){   // Infinite loop to allow multiple calculations until user exits.

    // displaying the calculator header
        System.out.println(" \n                 -------------------");
        System.out.println("                | Simple Calculator |");
        System.out.println("                 -------------------");

    // Displaying the available operations 
      System.out.println("\nselect your choice of operation from the below options (1 - 4)numbers only:");
      System.out.println("----------------------------------------------------------------------------");
      System.out.println("1.)Addition\n2.)substraction\n3.)multplication\n4.)division");
      System.out.println("enter your choice from (1- 4) : ");
     
      // looking for the invalid input for choice ( Ensuring that the user can only select the numeric only values)
      if(!userinput.hasNextInt()){  
        System.out.println(" Invalid Input : you cannot select non - numeric values ");
        System.out.println("\nselect your choice of operation from the options (1 - 4)numbers only:");
        userinput.next();
        continue;  // Restart the loop again.
      }

// Exit the loop here by seledcting number "0"
      int choice = userinput.nextInt();
      if(choice == 0){
        System.out.println(" Thankyou for using simple calculator. !!! GOODBYE !!!");
        break;  
      }

// checking for the invalidation of choice.
      if (choice >4) {  
        System.out.println("Invalid choice! Please select a valid option.");
        continue; // Restart the loop again.
    }

// Reading the first number    
    System.out.println("Enter your first number:");
    if (!userinput.hasNextDouble()) { // Checking if input is a valid number
        System.out.println("Invalid input! Please enter a valid number.");
        userinput.next(); // Clear invalid input
        continue; // Restart the loop
    }
    double num1 = userinput.nextDouble(); // Reading first number


    // Reading the second number    
            System.out.println("Enter your Second number:");
            if (!userinput.hasNextDouble()) { // Checking if input is a valid number
                System.out.println("Invalid input! Please enter a valid number.");
                userinput.next(); // Clear invalid input
                continue; // Restart the loop
            }
            double num2 = userinput.nextDouble(); // Reading Second number
       double result;

       // Performing the selected operation
       if(choice==1){ // ADDITION
        result = num1+num2;
        System.out.println("The addition of "+num1+" + "+num2+" = "+result);
       }

    
       else if(choice==2){ //SUBSTRACTION
        result = num1-num2;
        System.out.println("The Substraction of "+num1+" + "+num2+" = "+result);
       }

       else if(choice==3){ //MULTIPLICATION
        result = num1*num2;
        System.out.println("The Multiply of "+num1+" + "+num2+" = "+result);
       }

       else if(choice==4){ // DIVISION
        if(num1==0 || num2==0){    // Checking the num1 and num2 for input "0". Because the division is not possible with zero.
        System.out.println("Error : Division by zero is not allowed.");
        }

        else{
        result = num1/num2;
        System.out.println("The Division of "+num1+" + "+num2+" = "+result);
        }
       }
    }
    userinput.close(); // Closing the Scanner to prevent resource leaks
}
}
