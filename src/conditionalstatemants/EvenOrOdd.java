package conditionalstatemants;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int result = Integer.parseInt(scanner.nextLine());

        if(result % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}
