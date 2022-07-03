package whilelooplab;

import java.util.Scanner;

public class EAccountBalance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;
        double moneyNum;

        String money = scanner.nextLine();

        while(!money.equals("NoMoreMoney")){
            moneyNum = Double.parseDouble(money);
            if(moneyNum < 0){
                System.out.println("Invalid operation!");
                break;
            }else{
                totalMoney += moneyNum;
                System.out.printf("Increase: %.2f\n", moneyNum);
                money = scanner.nextLine();
            }
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
