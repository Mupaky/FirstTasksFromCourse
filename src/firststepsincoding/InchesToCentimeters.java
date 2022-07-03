package firststepsincoding;

import java.util.Scanner;

public class InchesToCentimeters {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double inchToSantimetar = 2.54;
        double santimetars = inches * inchToSantimetar;
        System.out.println(santimetars);
    }
}
