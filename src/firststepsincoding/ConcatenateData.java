package firststepsincoding;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lasttName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lasttName,age,town);
    }
}
