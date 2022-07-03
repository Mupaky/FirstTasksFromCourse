package whilelooplab;

import java.util.Scanner;

public class AReadText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.toLowerCase().equals("stop")){
            System.out.println(text);
            text = scanner.nextLine();

        }
    }
}
