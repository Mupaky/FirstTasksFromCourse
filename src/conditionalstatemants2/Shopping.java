package conditionalstatemants2;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardAmount = Integer.parseInt(scanner.nextLine());
        int processorAmount = Integer.parseInt(scanner.nextLine());
        int ramAmount = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = 250;
        double processorPrice;
        double ramPrice;

        if(budget >= 0 && budget <= 100000
                    && videoCardAmount >= 0 && videoCardAmount <= 100
                    && processorAmount >= 0 && processorAmount <= 100
                    && ramAmount >= 0 && ramAmount <= 100){
            processorPrice = videoCardPrice * videoCardAmount * 0.35;
            ramPrice = videoCardPrice * videoCardAmount * 0.1;
            double totalPrice = videoCardPrice * videoCardAmount
                    + processorAmount * processorPrice
                    + ramAmount * ramPrice;
            if(videoCardAmount > processorAmount){
                totalPrice = totalPrice - totalPrice * 0.15;
            }

            if(budget >= totalPrice){
                System.out.printf("You have %.2f leva left!", budget - totalPrice);
            }else {
                System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
            }
        }

    }
}
