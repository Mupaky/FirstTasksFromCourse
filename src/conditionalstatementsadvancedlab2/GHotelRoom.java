package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class GHotelRoom {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int daysVacation = Integer.parseInt(scanner.nextLine());

        double apartmentPricePerDay;
        double studioPricePerDay;
        double discountStudio = 0;
        double discountApartment = 0;
        double totalStudio;
        double totalApartment;

        if(daysVacation >= 0 && daysVacation <= 200 &&
                (month.equals("May") || month.equals("October") ||
                        month.equals("June") || month.equals("September") ||
                                month.equals("July") || month.equals("August"))){

            if(month.equals("May") || month.equals("October")){
                if(daysVacation > 7 && daysVacation <= 14){
                    discountStudio = 0.05;
                }else if(daysVacation > 14){
                    discountStudio = 0.3;
                }
                studioPricePerDay = 50;
                apartmentPricePerDay = 65;
            }else if(month.equals("June") || month.equals("September")){
                if(daysVacation > 14){
                    discountStudio = 0.2;
                }
                studioPricePerDay = 75.2;
                apartmentPricePerDay = 68.7;
            }else{
                studioPricePerDay = 76;
                apartmentPricePerDay = 77;
            }
            if(daysVacation > 14){
                discountApartment = 0.1;
            }

            totalStudio = daysVacation * studioPricePerDay;
            totalStudio = totalStudio - totalStudio * discountStudio;

            totalApartment = daysVacation * apartmentPricePerDay;
            totalApartment = totalApartment - totalApartment * discountApartment;

            System.out.printf("Apartment: %.2f lv." + "\n", totalApartment);
            System.out.printf("Studio: %.2f lv.", totalStudio);
        }


    }
}
