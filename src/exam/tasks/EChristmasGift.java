package exam.tasks;

import java.util.Scanner;

public class EChristmasGift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearsFamilyMember = scanner.nextLine();
        int numOfAdults = 0;
        int numOfKids = 0;
        int moneyForToys = 0;
        int moneyForSweaters = 0;

        while (!yearsFamilyMember.equals("Christmas")){
            int yearsFMember = Integer.parseInt(yearsFamilyMember);
            if(yearsFMember >= 1 && yearsFMember <= 130){
                if(yearsFMember <= 16){
                    numOfKids++;
                    moneyForToys += 5;
                }else {
                    numOfAdults++;
                    moneyForSweaters += 15;
                }
            }


            yearsFamilyMember = scanner.nextLine();
            if(yearsFamilyMember.equals("Christmas")){
                break;
            }

        }
        System.out.printf("Number of adults: %d\n", numOfAdults);
        System.out.printf("Number of kids: %d\n", numOfKids);
        System.out.printf("Money for toys: %d\n", moneyForToys);
        System.out.printf("Money for sweaters: %d\n", moneyForSweaters);




    }
}
