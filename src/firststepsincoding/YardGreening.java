package firststepsincoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many meters is the yard?");
        double squareMeters = Double.parseDouble(scanner.nextLine());
        double priceSquareDDS = 7.61;

        if(squareMeters >= 0.00 && squareMeters <= 10000.00){

            double priceYard = priceSquareDDS *squareMeters;
            double discount = priceYard * 18 / 100;
            System.out.println("The final price is: " + (priceYard - discount) +  " lv.");
            System.out.printf("The discount is: %f lv.",discount);
        }else{
            System.out.println("Enter number from 0 to 10000");
        }
    }
}
