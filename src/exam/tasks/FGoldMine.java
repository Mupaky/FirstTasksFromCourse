package exam.tasks;

import java.util.Scanner;

public class FGoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmountGold = 0;

        int locationsAmount = Integer.parseInt(scanner.nextLine());

        if(locationsAmount >= 1 && locationsAmount <= 100){
            for(int i = 1; i <= locationsAmount; i ++){

                double expected = Double.parseDouble(scanner.nextLine());
                int daysAmount = Integer.parseInt(scanner.nextLine());

                if(expected >= 0 && expected <= 10000 &&
                    daysAmount >= 1 && daysAmount <= 30){

                    for (int j = 1; j <= daysAmount; j++){

                        double amountGoldPerDay = Double.parseDouble(scanner.nextLine());
                        if(amountGoldPerDay >= 0 && amountGoldPerDay <= 1000){
                            totalAmountGold += amountGoldPerDay;
                        }else{
                            j--;
                        }
                    }
                }else{
                    --i;
                    continue;
                }
                double averageGoldPerDay = totalAmountGold / daysAmount;
                if(averageGoldPerDay >= expected){
                    System.out.printf("Good job! Average gold per day: %.2f.\n", averageGoldPerDay);
                }else{
                    System.out.printf("You need %.2f gold.\n", (expected - averageGoldPerDay));
                }
                totalAmountGold = 0;
            }
        }

    }
}
