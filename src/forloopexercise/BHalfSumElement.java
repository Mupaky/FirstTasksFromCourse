package forloopexercise;

import java.util.Scanner;

public class BHalfSumElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberN = Integer.parseInt(scanner.nextLine());

        int maxNumber = 0;
        int sum = 0;

        if(numberN >= 1){
            for(int i = 0; i <= numberN - 1; i++){
                int var = Integer.parseInt(scanner.nextLine());
                if(var > maxNumber && var != 0){
                    sum = sum + maxNumber;
                    maxNumber = var;
                }else{
                    sum = sum + var;
                }
            }

            if(maxNumber == sum){
                System.out.println("Yes");
                System.out.println("Sum = " + sum);
            }else{
                int diff = Math.abs(maxNumber - sum);
                System.out.println("No");
                System.out.println("Diff = " + diff);
            }
        }

    }
}
