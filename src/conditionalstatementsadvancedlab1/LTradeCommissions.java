package conditionalstatementsadvancedlab1;

import java.util.Scanner;

public class LTradeCommissions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (city){
            case "sofia":
                if(quantity >= 0 && quantity <= 500){
                    System.out.printf("%.2f", quantity * 0.05);
                }else if(quantity > 500 && quantity <= 1000){
                    System.out.printf("%.2f", quantity * 0.07);
                }else if(quantity > 1000 && quantity <= 10000){
                    System.out.printf("%.2f", quantity * 0.08);
                }else if(quantity > 10000){
                    System.out.printf("%.2f", quantity * 0.12);
                }else {
                    System.out.println("error");
                }
                break;
            case "varna":
                if(quantity >= 0 && quantity <= 500){
                    System.out.printf("%.2f", quantity * 0.045);
                }else if(quantity > 500 && quantity <= 1000){
                    System.out.printf("%.2f", quantity * 0.075);
                }else if(quantity > 1000 && quantity <= 10000){
                    System.out.printf("%.2f", quantity * 0.1);
                }else if(quantity > 10000){
                    System.out.printf("%.2f", quantity * 0.13);
                }else {
                    System.out.println("error");
                }
                break;
            case "plovdiv":
                if(quantity >= 0 && quantity <= 500){
                    System.out.printf("%.2f", quantity * 0.055);
                }else if(quantity > 500 && quantity <= 1000){
                    System.out.printf("%.2f", quantity * 0.08);
                }else if(quantity > 1000 && quantity <= 10000){
                    System.out.printf("%.2f", quantity * 0.12);
                }else if(quantity > 10000){
                    System.out.printf("%.2f", quantity * 0.145);
                }else{
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;

        }

    }
}
