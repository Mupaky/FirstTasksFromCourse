package whilelooplab;

import java.util.Scanner;

public class DSequence2k1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberN = Integer.parseInt(scanner.nextLine());
        int number = 1;

        while (number <= numberN){
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}
