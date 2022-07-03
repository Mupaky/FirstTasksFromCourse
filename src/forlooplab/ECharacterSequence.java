package forlooplab;

import java.util.Scanner;

public class ECharacterSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if(!str.isEmpty()){
            for(int i = 0; i <= str.length() - 1; i++){
                System.out.println(str.charAt(i));
            }
        }

    }
}
