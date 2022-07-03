package exam.tasks;

import java.util.Scanner;

public class BANDProcessors {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int processorsAmount = Integer.parseInt(scanner.nextLine());
        int employeesAmount = Integer.parseInt(scanner.nextLine());
        int daysWork = Integer.parseInt(scanner.nextLine());
        int hoursWorked = 8;

        if(processorsAmount >= 1 && processorsAmount <= 500000 &&
            employeesAmount >= 1 && employeesAmount <= 1000 &&
            daysWork >= 1 && daysWork <= 1000){

            int totalHours = employeesAmount * daysWork * hoursWorked;
            int totalProcessors = (int)((double)totalHours / 3);
            if(totalProcessors < processorsAmount){
                int processorsToProduce = processorsAmount - totalProcessors;
                double lostMoney = processorsToProduce * 110.10;
                System.out.printf("Losses: -> %.2f BGN", lostMoney);
            }else if(totalProcessors > processorsAmount){
                double profit = (totalProcessors - processorsAmount) * 110.10;
                System.out.printf("Profit: -> %.2f BGN", profit);
            }else{
                System.out.println("Profit: -> 0.00 BGN");
            }

        }


    }
}
