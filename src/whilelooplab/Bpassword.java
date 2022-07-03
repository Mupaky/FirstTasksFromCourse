package whilelooplab;

import java.util.Scanner;

public class Bpassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();

        String passwordLogin = scanner.nextLine();

        while (!passwordLogin.equals(password)){
            passwordLogin = scanner.nextLine();
            if(password.equals(passwordLogin)){
                break;
            }
        }
        System.out.printf("Welcome %s!", name);
    }
}
