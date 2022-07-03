package forlooplab;

import java.util.Scanner;

public class ILeftAndRightSum {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int sumLeft = 0;
        int sumRight = 0;

        int counter = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i <= counter - 1; i++){
            sumLeft = sumLeft + Integer.parseInt(scanner.nextLine());
        }

        for(int i = 0; i <= counter - 1; i++){
            sumRight = sumRight + Integer.parseInt(scanner.nextLine());
        }

        if(sumLeft == sumRight){
            System.out.println("Yes, sum = " + (sumLeft));
        }else if(sumLeft > sumRight) {
            System.out.println("No, diff = " + (sumLeft - sumRight));
        }else{
            System.out.println("No, diff = " + (sumRight - sumLeft));
        }

    }
}
