package exam.tasks;

import java.util.Scanner;

public class AProgramingBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bookPages = 899;
        int bookCovers = 2;

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int discountInPercentage = Integer.parseInt(scanner.nextLine());
        double priceDesigner = Double.parseDouble(scanner.nextLine());
        int discountTeam = Integer.parseInt(scanner.nextLine());

        if(pricePerPage >= 0 && pricePerPage <= 1.5 &&
            pricePerCover >= 0 && pricePerCover <= 5 &&
            discountInPercentage >= 0 && discountInPercentage <= 100 &&
            priceDesigner >= 0 && priceDesigner <= 150 &&
            discountTeam >= 0 && discountTeam <= 100){

            double totalPriceBook = bookPages * pricePerPage + bookCovers * pricePerCover;
            totalPriceBook -= totalPriceBook * discountInPercentage / 100;
            totalPriceBook += priceDesigner;
            totalPriceBook -= totalPriceBook * discountTeam / 100;

            System.out.printf("Avtonom should pay %.2f BGN.", totalPriceBook);



        }
    }
}
