package firstexercise;

import java.util.Scanner;

public class FishTank {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int longSide = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double procentSpace = Double.parseDouble(scanner.nextLine()) / 100;

        if(longSide >= 10 && longSide <= 500
                && wight >= 10 && wight <= 300
                && height >= 10 && height <= 200
                && procentSpace >= 0.000 && procentSpace <= 100.000){
            double obem = longSide * wight * height;
            double obemInLiters = obem * 0.001;

            System.out.println(obemInLiters * (1 - procentSpace));
        }
    }
}
