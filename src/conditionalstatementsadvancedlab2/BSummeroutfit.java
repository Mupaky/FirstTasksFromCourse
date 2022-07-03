package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class BSummeroutfit {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine().toLowerCase();

        String outFit = "";
        String shoes = "";

        if(degrees >= 10 && degrees <= 42){
            if(degrees >= 10 && degrees <= 18){
                if("morning".equals(dayTime)){
                    outFit = "SweatShirt";
                    shoes = "Sneakers";
                }else if("afternoon".equals(dayTime)){
                    outFit = "Shirt";
                    shoes = "Moccasins";
                }else if("evening".equals(dayTime)){
                    outFit = "Shirt";
                    shoes = "Moccasins";

                }
            }else if(degrees > 18 && degrees <= 24){
                if("morning".equals(dayTime)){
                    outFit = "Shirt";
                    shoes = "Moccasins";
                }else if("afternoon".equals(dayTime)){
                    outFit = "T-Shirt";
                    shoes = "Sandals";
                }else if("evening".equals(dayTime)){
                    outFit = "Shirt";
                    shoes = "Moccasins";

                }
            }else if(degrees > 24 && degrees <= 42){
                if("morning".equals(dayTime)){
                    outFit = "T-Shirt";
                    shoes = "Sandals";
                }else if("afternoon".equals(dayTime)){
                    outFit = "Swim Suit";
                    shoes = "Barefoot";
                }else if("evening".equals(dayTime)){
                    outFit = "Shirt";
                    shoes = "Moccasins";


                }
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outFit, shoes);
        }




    }
}
