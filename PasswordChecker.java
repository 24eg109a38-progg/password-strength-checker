import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)) hasUpper = true;
            if(Character.isDigit(c)) hasNumber = true;
            if(!Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        if(password.length() >= 8 && hasUpper && hasNumber && hasSpecial){
            System.out.println("Strong Password");
        } 
        else if(password.length() >= 6){
            System.out.println("Medium Password");
        } 
        else{
            System.out.println("Weak Password");
        }
    }
}