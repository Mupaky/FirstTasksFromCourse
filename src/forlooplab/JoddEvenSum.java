package forlooplab;

import java.util.Scanner;

public class JoddEvenSum {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int sumOdd = 0;
        int sumEven = 0;

        int counter = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= counter - 1; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(i % 2 == 0){
                sumEven = sumEven + number;
            }else{
                sumOdd = sumOdd + number;
            }
        }

        if(sumOdd == sumEven){
            System.out.println("Yes \nSum = " + (sumOdd));
        }else if(sumOdd > sumEven) {
            System.out.println("No \nDiff = " + (sumOdd - sumEven));
        }else{
            System.out.println("No \nDiff = " + (sumEven - sumOdd));
        }
    }
}
