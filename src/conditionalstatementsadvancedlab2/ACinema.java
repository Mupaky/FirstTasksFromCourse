package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class ACinema {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine().toLowerCase();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double premierePrice = 12;
        double normalPrice = 7.5;
        double discountPrice = 5;

        if(!projection.equals(null) && rows >= 0 && columns >= 0){
            double totalIncome = 0;

            if("premiere".equals(projection)){
                totalIncome = rows * columns * premierePrice;
            }else if("normal".equals(projection)){
                totalIncome = rows * columns * normalPrice;
            }else if("discount".equals(projection)){
                totalIncome = rows * columns * discountPrice;
            }
            System.out.printf("%.2f leva", totalIncome);

        }



    }
}
