package conditionalstatemants;

import java.util.Scanner;

public class PasswordGuess {



    public static void main(String[] args){

        String password = "s3cr3t!P@ssw0rd";
        Scanner scanner = new Scanner(System.in);

        String passwordUser = scanner.nextLine();

        if(passwordUser.equals(password)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }

    }
}
