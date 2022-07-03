package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class EJourney {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String where = "";
        String hoterOrCamp = "";
        double spendMoney;

        if(budged > 10.00 && budged <= 5000.00 &&
                (season.equals("summer") || season.equals("winter"))){

            if(budged >= 1 && budged <= 100){
                where = "Bulgaria";
                if("summer".equals(season)){
                    spendMoney = budged * 0.3;
                    hoterOrCamp = "Camp";
                }else{
                    spendMoney = budged * 0.7;
                    hoterOrCamp = "Hotel";
                }
            }else if(budged > 100 && budged <= 1000){
                where = "Balkans";
                if("summer".equals(season)){
                    spendMoney = budged * 0.4;
                    hoterOrCamp = "Camp";
                }else{
                    spendMoney = budged * 0.8;
                    hoterOrCamp = "Hotel";
                }
            }else{
                where = "Europe";
                spendMoney = budged * 0.9;
                hoterOrCamp = "Hotel";
            }

            System.out.printf("Somewhere in %s" + "\n", where);
            System.out.printf("%s - %.2f", hoterOrCamp, spendMoney);
        }

    }
}
