package firstexercise;

import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args){
        double penPrice = 5.80;
        double markerPrice = 7.20;
        double preparatLiterPrice = 1.20;

        Scanner scanner = new Scanner(System.in);
        int penAmount = Integer.parseInt(scanner.nextLine());
        int markerAmount = Integer.parseInt(scanner.nextLine());
        int prepatarLiters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        if(penAmount >= 0 && penAmount <= 100
            && markerAmount >= 0 && markerAmount <= 100
            && prepatarLiters >= 0 && prepatarLiters <= 50
            && discount >= 0 && discount <= 100){
            double sum = (penAmount * penPrice
                    + markerAmount * markerPrice
                    + prepatarLiters * preparatLiterPrice);
            double sumDiscoint = sum - sum * discount/100;
            System.out.println(sumDiscoint);
        }
    }
}
