package conditionalstatementsadvancedlab1;

import java.util.Scanner;

public class KFruitShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());




        switch (day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                switch (product){
                    case "banana":
                        System.out.printf("%.2f", quantity * 2.5);
                        break;
                    case "apple":
                        System.out.printf("%.2f", quantity * 1.2);
                        break;
                    case "orange":
                        System.out.printf("%.2f", quantity * 0.85);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", quantity * 1.45);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", quantity * 2.7);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", quantity * 5.5);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", quantity * 3.85);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }

                break;
            case "saturday":
            case "sunday":
                switch (product){
                    case "banana":
                        System.out.printf("%.2f", quantity * 2.7);
                        break;
                    case "apple":
                        System.out.printf("%.2f", quantity * 1.25);
                        break;
                    case "orange":
                        System.out.printf("%.2f", quantity * 0.90);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", quantity * 1.60);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", quantity * 3);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", quantity * 5.6);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", quantity * 4.2);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
