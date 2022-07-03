package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class CNewHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String flowersKind = scanner.nextLine();
        int flowerAmount = Integer.parseInt(scanner.nextLine());
        int budged = Integer.parseInt(scanner.nextLine());


        if((flowerAmount >= 10 && flowerAmount <= 1000) && budged >= 50 && budged <= 2500){
            double flowersPrice = 0;
            if("Roses".equals(flowersKind)){
                if(flowerAmount > 80){
                    flowersPrice = flowerAmount * 5 ;
                    flowersPrice = flowersPrice - flowersPrice * 0.1;
                }else{
                    flowersPrice = flowerAmount * 5;
                }

            }else if("Dahlias".equals(flowersKind)){
                if(flowerAmount > 90){
                    flowersPrice = flowerAmount * 3.8;
                    flowersPrice = flowersPrice - flowersPrice * 0.15;
                }else {
                    flowersPrice = flowerAmount * 3.8;
                }

            }else if("Tulips".equals(flowersKind)){
                if(flowerAmount > 80){
                    flowersPrice = flowerAmount * 2.8;
                    flowersPrice = flowersPrice - flowersPrice * 0.15;
                }else{
                    flowersPrice = flowerAmount * 2.8;
                }

            }else if("Narcissus".equals(flowersKind)){
                if(flowerAmount < 120){
                    flowersPrice = flowerAmount * 3 ;
                    flowersPrice = flowersPrice + flowersPrice * 0.15;
                }else{
                    flowersPrice = flowerAmount * 3;
                }

            }else if("Gladiolus".equals(flowersKind)){
                if(flowerAmount < 80){
                    flowersPrice = flowerAmount * 2.5;
                    flowersPrice = flowersPrice + flowersPrice * 0.2;
                }else{
                    flowersPrice = flowerAmount * 2.5;
                }

            }
            if(budged >= flowersPrice && flowersPrice != 0){
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                        flowerAmount, flowersKind, budged - flowersPrice);
            }else if(budged < flowersPrice){
                System.out.printf("Not enough money, you need %.2f leva more.",
                        flowersPrice - budged);
            }

        }


    }

}
