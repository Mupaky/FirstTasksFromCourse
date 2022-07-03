package conditionalstatementsadvancedlab1;

import java.util.Scanner;

public class ESmallShop {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        if(town.equals("sofia")){
            if(product.equals("coffee")){
                System.out.printf("%.2f", quantity * 0.5);
            }else if(product.equals("water")) {
                System.out.printf("%.2f", quantity * 0.8);
            }else if(product.equals("beer")){
                System.out.printf("%.2f", quantity * 1.2);
            }else if(product.equals("sweets")){
                System.out.printf("%.2f", quantity * 1.45);
            }else if(product.equals("peanuts")){
                System.out.printf("%.2f", quantity * 1.6);
            }
        }else if(town.equals("plovdiv")){
            if(product.equals("coffee")){
                System.out.printf("%.2f", quantity * 0.4);
            }else if(product.equals("water")) {
                System.out.printf("%.2f", quantity * 0.7);
            }else if(product.equals("beer")){
                System.out.printf("%.2f", quantity * 1.15);
            }else if(product.equals("sweets")){
                System.out.printf("%.2f", quantity * 1.3);
            }else if(product.equals("peanuts")){
                System.out.printf("%.2f", quantity * 1.5);
            }
        }else if(town.equals("varna")){
            if(product.equals("coffee")){
                System.out.printf("%.2f", quantity * 0.45);
            }else if(product.equals("water")) {
                System.out.printf("%.2f", quantity * 0.7);
            }else if(product.equals("beer")){
                System.out.printf("%.2f", quantity * 1.1);
            }else if(product.equals("sweets")){
                System.out.printf("%.2f", quantity * 1.35);
            }else if(product.equals("peanuts")){
                System.out.printf("%.2f", quantity * 1.55);
            }
        }



    }
}
