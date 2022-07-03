package firstexercise;

import java.util.Scanner;

public class BascketballEquipment {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int yearTaxBasketball = Integer.parseInt(scanner.nextLine());


        if(yearTaxBasketball >= 0 && yearTaxBasketball <= 9999){
            double kecove = yearTaxBasketball - yearTaxBasketball * 0.4;
            double ekip = kecove - kecove * 0.2;
            double ball = ekip / 4;
            double accesories = ball / 5;
            double sum = yearTaxBasketball + kecove + ekip + ball + accesories;
            System.out.println(sum);
        }
    }
}
