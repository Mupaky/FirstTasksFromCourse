package whilelooplab;

import java.util.Scanner;

public class GMinNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!num.equals("Stop")){
            int number = Integer.parseInt(num);
            if(number < minNumber){
                minNumber = number;
            }
            num = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
