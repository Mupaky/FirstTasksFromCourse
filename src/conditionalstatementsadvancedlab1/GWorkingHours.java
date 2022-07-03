package conditionalstatementsadvancedlab1;

import java.util.Scanner;

public class GWorkingHours {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine().toLowerCase();

        if(hour >= 0 && hour <= 23){
            switch (day) {
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday":
                case "saturday":
                    if (hour >= 10 && hour <= 18) {
                        System.out.println("open");
                    } else {
                        System.out.println("closed");
                    }
                    break;
                case "sunday":
                    System.out.println("closed");
                    break;
                default:
                    break;
            }
        }
    }

}
