package forlooplab;

import java.util.Scanner;

public class BNumbersN1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberN = Integer.parseInt(scanner.nextLine());

        if(numberN >= 1){
            for(int i = numberN; i >= 1; i--){
                System.out.println(i);
            }
        }

    }
}
