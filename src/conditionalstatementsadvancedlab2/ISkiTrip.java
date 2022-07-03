package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class ISkiTrip {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int daysVacation = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();

        double onePersonRoom = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;



        if(daysVacation >= 0 && daysVacation <= 365 &&
                (room.equals("room for one person") ||
                        room.equals("apartment") ||
                        room.equals("president apartment")) &&
                (rating.equals("positive") || rating.equals("negative"))){


            double price = 0;

            switch (room){
                case "room for one person":
                    price = onePersonRoom;
                    break;
                case "apartment":
                    if(daysVacation < 10){
                        price = apartment - apartment * 0.3;
                    }else if(daysVacation >= 10 && daysVacation <= 15){
                        price = apartment - apartment * 0.35;
                    }else {
                        price = apartment - apartment * 0.5;
                    }
                    break;
                case "president apartment":
                    if(daysVacation < 10){
                        price = presidentApartment - presidentApartment * 0.1;
                    }else if(daysVacation >= 10 && daysVacation <= 15){
                        price = presidentApartment - presidentApartment * 0.15;
                    }else {
                        price = presidentApartment - presidentApartment * 0.2;
                    }
                    break;
            }

            double totalprice = (daysVacation -1) * price;

            if(rating.equals("positive")){
                totalprice = totalprice + totalprice * 0.25;
            }else {
                totalprice = totalprice - totalprice * 0.10;
            }
            System.out.printf("%.2f", totalprice);

        }

    }
}
