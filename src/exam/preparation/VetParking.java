package exam.preparation;

import java.util.Scanner;

public class VetParking {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double priceEvenDayOddHour = 2.5;
        double priceOddDayEvenHour = 1.25;
        double price = 1;
        double sumDay = 0;
        double totalSumDays = 0;

        if(days >= 1 && days <= 5 &&
            hours >= 1 && hours <= 24){
            for(int i = 1; i <= days; i++){
                for(int j = 1; j <= hours; j++){
                    if((i % 2) == 0){
                        if((j % 2) != 0){
                            sumDay += priceEvenDayOddHour;
                        }else{
                            sumDay += price;
                        }
                    }else{
                        if(j % 2 == 0){
                            sumDay += priceOddDayEvenHour;
                        }else{
                            sumDay += price;
                        }
                    }
                }
                totalSumDays += sumDay;
                System.out.printf("Day: %d - %.2f leva\n", i, sumDay);
                sumDay = 0;
            }
            System.out.printf("Total: %.2f leva", totalSumDays);

        }
    }
}
