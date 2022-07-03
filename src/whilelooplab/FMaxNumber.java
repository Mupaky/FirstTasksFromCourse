package whilelooplab;

import java.util.Scanner;

public class FMaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!num.equals("Stop")){
            int number = Integer.parseInt(num);
            if(number > maxNumber){
                maxNumber = number;
            }
            num = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
