package studentQuestions;

import java.util.Scanner;

public class VariableScopingWithExtractingMethods {
	
	static Scanner sc = new Scanner(System.in); //allows user input - global scope
    
    public static void main(String[] args) {
        //prompt the user to input something
        
        int decision = 0;
        String userName = "";
        
        
        //the application exits if the user picks 5
        while (decision != 5) {
            menuPrintOut();
            
            decision = sc.nextInt();
        

            if (decision >= 6 || decision <= 0) {
                followInstructions();
            } else if (decision == 1) {
                userName = getUserName();
                checkUserName(userName);
            } else if (decision == 2) {
                System.out.print("Pick yes or no: ");
                String yes = sc.next();
                
                if (yes.equals("Yes")) {
                    System.out.println("Will, Mom says no!");
                
                } else {
                    System.out.println("But Yes is my favorite answer!");
                }
                
            } else if (decision == 3) {
                int num = 0;
                while (num != 1) {
                    //game runs until user picks 0
                System.out.print("Pick a number between 0 and 5: ");
                num = sc.nextInt();
                    
                if (num > -1 && num <= 5) {
                    System.out.println("You picked: " + num);
                }
            }
                System.out.println("The number game is over!");
            
            } else if (decision == 4) {
                if (!userName.equals("")) {
                    System.out.println("I'm tired of picking options. Pick option 5 already!");
              
                } else {
                    System.out.println("Have you played the number game yet?");
                }
            }
        }
        
        System.out.println("Goodbye!");    
    }
    
    public static void menuPrintOut() {
        System.out.println("1) Create a Username");
        System.out.println("2) Pick Yes or No");
        System.out.println("3) Play a number game");
        System.out.println("4) Option 4");
        System.out.println("5) Exit");
        System.out.print("Pick an option: " );
    }
    
    public static void followInstructions() {
        System.out.println("Please FOLLOW THE INSTRUCTIONS!");
    }
    public static String getUserName() {
        System.out.print("Enter user name: ");
        return sc.next();
    }
    
    public static void checkUserName(String userName) {
        if(userName.equals("Will")) {
            System.out.println("Whatcha doin' Will?");
        } else {
            System.out.println("Welcome " + userName + "!");
        }
    }

}
