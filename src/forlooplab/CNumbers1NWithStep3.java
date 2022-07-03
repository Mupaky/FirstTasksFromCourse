package forlooplab;

import java.util.Scanner;

public class CNumbers1NWithStep3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberN = Integer.parseInt(scanner.nextLine());

        if(numberN >= 1){
            for(int i = 1; i <= numberN; i += 3){
                System.out.println(i);
            }
        }

    }
}
