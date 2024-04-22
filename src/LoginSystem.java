
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ST10197780
 */
public class LoginSystem {

         private static Map<String, String> users = new HashMap<>();
         private static Map<String, String> inIt = new HashMap<>();

    static String userName;
   static String password;
   static String firstName;
   static String lastName;
    static int pLength;
     
    public static void main(String[] args) {
        
        mainMenu();
        
        
        
        
    }
    
    public static void message(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username must contain an underscore and must be 5 characters long");
        System.out.println("try again (yes/no)");
         String choice = scanner.nextLine();

            // this code checks if the user wants to continue registration
            if (!choice.equalsIgnoreCase("yes")) {
                mainMenu();
            }
            if (!choice.equalsIgnoreCase("no")) {
                exit();
            }
    }
    
    
    
    public static void exit(){
        System.out.println("Thank for dropping by, hope to see you again soon;) ");
    }
    
    
    public static void hasUnderscore(){
        Scanner scanner = new Scanner(System.in);
        if (!containsUnderscore (userName) ) {
            System.out.println("Username must comtain an underscore "
                    + "and must be no more then 5 characters long");
             System.out.println("try again (yes/no)");
         String choice = scanner.nextLine();

            // Check if the user wants to continue registration
            if (!choice.equalsIgnoreCase("yes")) {
                mainMenu();
            }
            if (!choice.equalsIgnoreCase("no")) {
                exit();
            }
                    
        } 
        
 
    }
    
    
    
    
    private static boolean containsUnderscore(String username) {
        return username.contains("_");
    }
    
    private static void checkPassword(){
       int hasSpecialChar;
        int hasCapitalLetter;
        int hasNumber;

        String specialChars = "!@#$%^&*()-_+=[]{}|;:,.<>?";
        
        for (char c : password.toCharArray()){
            if (specialChars.contains(String.valueOf(c))) {
                hasSpecialChar = 1;
            } else if (Character.isUpperCase(c)) {
                hasCapitalLetter = 1;
            } else if (Character.isDigit(c)) {
                hasNumber =1;
            }
        }
        
        
   }
    
    
    public  static void passCheck(){
        
          
        boolean hasSpecialChar;
        boolean hasCapital;
        boolean hasNumber;

        String specialChars = "!@#$%^&*()-_+=[]{}|;:,.<>?";
        
        for (char c : password.toCharArray()){
            if (specialChars.contains(String.valueOf(c))) {
                hasSpecialChar = true;
            } else if (Character.isUpperCase(c)) {
                hasCapital = true;
            } else if (Character.isDigit(c)) {
                hasNumber =true;
            }
        }
        
        pLength = password.length() ;
        if (hasSpecialChar = true){
            System.out.println("Special character*");
        }
        else if(hasCapital = true){
            System.out.println("Capital*");
        }
        else if(hasNumber = true){
            System.out.println("Number*");
        }
          pLength = password.length() ;
          if (pLength == 8){
              System.out.println("Password approved");
          }
          else {System.out.println("Password must be 8 characters long and contain a "
                  + "capital letter, a number and a special charecter");
          }
          if (hasSpecialChar=true){
              System.out.println("Password approved");
          }
          else {System.out.println("Password must be 8 characters long and contain a "
                  + "capital letter, a number and a special charecter");
          }
          if (hasCapital=true){
              System.out.println("Password approved");
          }
          else {System.out.println("Password must be 8 characters long and contain a "
                  + "capital letter, a number and a special charecter");
          }
          
          if (hasNumber=true){
              System.out.println("Password approved");
          }
          else {System.out.println("Password must be 8 characters long and contain a "
                  + "capital letter, a number and a special charecter");
          }
      }
    
    
    
    public static void mainMenu(){
        
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome:) ");
            System.out.println("1. SignUp");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    // signup method
                    registerUser();
                    break;
                case 2:
                    
                    // login method
                    loginUser();
                    break;
                case 3:
                    //exit the app
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                
            }
        } while (choice != 3);

        scanner.close();
    }
    
    
    public static void registerUser(){
        
        Scanner scanner = new Scanner(System.in);
        boolean hasCapital = false ;
        boolean hasNumber = false ;
       
        
        System.out.println("Main Menu");

        
            
            // Prompt user to enter First name
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();
            // Prompt user to enter Last name
            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            
            // Prompt user to enter username
            System.out.println("Enter username:");
            String userName = scanner.nextLine();
            
            // Check if the username already exists
        if (users.containsKey(userName)) {
            System.out.println("Username already exists. Please choose a different one.");
            registerUser();
        } 
           
            // user name check
             int uLength = userName.length();
             
             
             
             
         if (uLength > 5) {
            System.out.println("Username must be no more then 5 characters long");
             System.out.println("try again (yes/no)");
         String choice = scanner.nextLine();

            // Check if the user wants to continue registration
            if (!choice.equalsIgnoreCase("yes")) {
                mainMenu();
            }
            if (!choice.equalsIgnoreCase("no")) {
               registerUser();
            }
                    
        }    
             
        if (!containsUnderscore (userName) ) {
            System.out.println("Username must comtain an underscore "
                    + "and must be no more then 5 characters long");
             System.out.println("try again (yes/no)");
         String choice = scanner.nextLine();

            // Check if the user wants to continue registration
            if (!choice.equalsIgnoreCase("yes")) {
                mainMenu();
            }
            if (!choice.equalsIgnoreCase("no")) {
               registerUser();
            }
                    
        } 
            
 
            // Prompt user to enter password
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            
            
            
           
         // password check    
       boolean hasSpecialChar = false; // Initialize hasSpecialChar before the loop
       
       int pLength = password.length();

String specialChars = "!@#$%^&*()-_+=[]{}|;:,.<>?";

for (char c : password.toCharArray()) { 
    if (specialChars.contains(String.valueOf(c))) {
        hasSpecialChar = true;
    } else if (Character.isUpperCase(c)) {
        hasCapital = true;
    } else if (Character.isDigit(c)) {
        hasNumber = true;
    }
}

       

if (!hasSpecialChar || !hasCapital || !hasNumber || pLength < 8) {
    System.out.println("Password must be no less then 8 characters long and contain a capital letter, a number, and a special character");
    registerUser(); // Retry registration
    return; // Exit the method
}

// Register the user

users.put(userName, password);
System.out.println("User registered successfully.");

// Ask user if they want to register another user
System.out.println("Do you want to register another user? (yes/no)");
String choice = scanner.nextLine();

if (choice.equalsIgnoreCase("yes")) {
    registerUser();
} else {
    mainMenu();
}
    
    }
    
    

    // Method to save user details
    private static void mapUser(String username, String password) {
        // Check if the username already exists
        if (users.containsKey(userName)) {
            System.out.println("Username already exists. Please choose a different one.");
        } else {
            // Add the user to the map of registered users
            users.put(userName, password);
            System.out.println("User registered successfully.");
        }
    }
    
    private static void loginUser(){
     Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the login page");

    // Prompt user to enter username
    System.out.println("Enter username:");
    String userName = scanner.nextLine();

    // Prompt user to enter password
    System.out.println("Enter password:");
    String password = scanner.nextLine();

    // Check if the username exists in the registered users
    if (users.containsKey(userName)) {
        // Check if the password matches the password associated with the username
        if (users.get(userName).equals(password)) {
            System.out.println("Login successful. Welcome back, " + userName + " nive to see you again");
            mainMenu();
            // Add code here to proceed with logged-in user actions
        } else {
            System.out.println("Username or password invalid, please try again");
            
            loginUser();
            
        }
    } else {
        System.out.println("Username not found. Please try again or register a new account."
                + " Do you want to register a new user (yes/no)");
        String choice = scanner.nextLine();

            // Check if the user wants to continue registration
            if (!choice.equalsIgnoreCase("yes")) {
                mainMenu();
            }
            if (!choice.equalsIgnoreCase("no")) {
               registerUser();
            }
        
    }

    
}
    
    // Method to login an existing user
    private static boolean loginUser(String userName, String password) {
        // Check if the username exists and the password matches
        return users.containsKey(userName) && users.get(userName).equals(password);
    }
     
}
