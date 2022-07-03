package forloopexercise;

import java.util.Scanner;

public class DCleaverLily {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double money = 0;
        double moneyPerYear = 10;
        double brotherTaking = 0;
        int toys = 0;


        if(years >= 1 && years<= 77
                && washingMachinePrice >= 1.00 && washingMachinePrice <= 10000
                && toyPrice >= 0.00 && toyPrice <= 40){

            for(int i = 1; i <= years; i++){
                if(i % 2 == 0){
                    money += moneyPerYear;
                    brotherTaking++;
                    moneyPerYear +=10;
                }else{
                    toys++;
                }
            }
            money += (toys * toyPrice) - brotherTaking;

            if(money >= washingMachinePrice){
                System.out.printf("Yes! %.2f", money - washingMachinePrice);
            }else {
                System.out.printf("No! %.2f", washingMachinePrice - money);
            }

        }


    }
}
