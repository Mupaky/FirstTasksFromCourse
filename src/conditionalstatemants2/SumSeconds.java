package conditionalstatemants2;

import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstRacer = Integer.parseInt(scanner.nextLine());
        int secondRacer = Integer.parseInt(scanner.nextLine());
        int thirdRacer = Integer.parseInt(scanner.nextLine());

        if(firstRacer >= 1 && firstRacer <=50
            && secondRacer >= 1 && secondRacer <=50
            && thirdRacer >= 1 && thirdRacer <=50){
            int totalTime = firstRacer + secondRacer + thirdRacer;
            int min = totalTime / 60;
            int sec = totalTime % 60;
            if(sec < 10){
                System.out.printf("%d:0%d", min, sec);
            }else {
                System.out.printf("%d:%d", min, sec);
            }

        }
    }
}
