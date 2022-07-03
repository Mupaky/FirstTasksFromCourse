package firstexercise;

import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int depositMonths = Integer.parseInt(scanner.nextLine());
        double yearPercentige = Double.parseDouble(scanner.nextLine());

        if(depositAmount >= 100.00 && depositAmount <= 10000.00
            && depositMonths >= 1 && depositMonths <= 12
            && yearPercentige >= 0.00 && yearPercentige <= 100.00){
            double sum = depositAmount + depositMonths * ((depositAmount * (yearPercentige/100)) /12);
            System.out.println(sum);
        }



    }
}
