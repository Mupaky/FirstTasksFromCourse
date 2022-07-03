package exam.tasks;

import java.util.Scanner;

public class CCatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeCat = scanner.nextLine();
        String maleFemale = scanner.nextLine();
        int age = 0;

        boolean isTypeGood = true;

        if(maleFemale.equals("m") || maleFemale.equals("f")) {
            switch (typeCat) {
                case "British Shorthair":
                    if (maleFemale.equals("m")) {
                        age = 13;
                    } else {
                        age = 14;
                    }
                    break;
                case "Siamese":
                    if (maleFemale.equals("m")) {
                        age = 15;
                    } else {
                        age = 16;
                    }
                    break;
                case "Persian":
                    if (maleFemale.equals("m")) {
                        age = 14;
                    } else {
                        age = 15;
                    }
                    break;
                case "Ragdoll":
                    if (maleFemale.equals("m")) {
                        age = 16;
                    } else {
                        age = 17;
                    }
                    break;
                case "American Shorthair":
                    if (maleFemale.equals("m")) {
                        age = 12;
                    } else {
                        age = 13;
                    }
                    break;
                case "Siberian":
                    if (maleFemale.equals("m")) {
                        age = 11;
                    } else {
                        age = 12;
                    }
                    break;
                default:
                    isTypeGood = false;
                    System.out.println(typeCat + " is invalid cat!");
                    break;
            }
            if (isTypeGood) {
                int months = age * 12;
                int catMonths = (int)Math.round(months/6);
                System.out.printf("%d cat months", catMonths);
            }
        }
    }
}
