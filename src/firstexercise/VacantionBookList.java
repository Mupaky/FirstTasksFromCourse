package firstexercise;

import java.util.Scanner;

public class VacantionBookList {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pagesAmount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        if(pagesAmount >= 1 && pagesAmount <= 1000
            && pagesPerHour >= 1 && pagesPerHour <= 1000
            && days >= 1 && days <= 1000){

            int sum = pagesAmount/pagesPerHour;
            System.out.println(sum/days);
        }
    }
}
