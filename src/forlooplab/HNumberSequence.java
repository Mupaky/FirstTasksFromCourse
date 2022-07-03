package forlooplab;

import java.util.Scanner;

public class HNumberSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countnumbers = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int min = 0;
        int var;

        for(int i = 0; i <= countnumbers - 1; i++){
            var =  Integer.parseInt(scanner.nextLine());
            if(i == 0 && var != 0){
                min = var;
                max = var;
            }
            if(max < var){
                max = var;
            }
            if(min > var){
                min = var;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }
}
