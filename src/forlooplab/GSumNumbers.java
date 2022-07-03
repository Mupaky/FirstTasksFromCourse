package forlooplab;

import java.util.Scanner;

public class GSumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countnumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for(int i = 0; i <= countnumbers - 1; i++){
            sum = sum + Integer.parseInt(scanner.nextLine());
        }

        System.out.println(sum);

    }
}
