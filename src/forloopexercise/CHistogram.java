package forloopexercise;

import java.text.MessageFormat;
import java.util.Scanner;

public class CHistogram {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberN = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        if(numberN >= 1 && numberN <= 1000){
            for(int i = 0; i <= numberN - 1; i++){
                int var = Integer.parseInt(scanner.nextLine());
                if(var < 200){
                    p1++;
                }else if(var >= 200 && var < 400){
                    p2++;
                }
                else if(var >= 400 && var < 600){
                    p3++;
                }
                else if(var >= 600 && var < 800){
                    p4++;
                }else{
                    p5++;
                }
            }
            System.out.printf("%.2f%%\n", (p1 / numberN) * 100);
            System.out.printf("%.2f%%\n", (p2 / numberN) * 100);
            System.out.printf("%.2f%%\n", (p3 / numberN) * 100);
            System.out.printf("%.2f%%\n", (p4 / numberN) * 100);
            System.out.printf("%.2f%%\n", (p5 / numberN) * 100);

        }
    }
}
