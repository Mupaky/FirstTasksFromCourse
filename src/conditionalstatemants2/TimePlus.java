package conditionalstatemants2;

import java.util.Scanner;

public class TimePlus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if(hour >= 0 &&  hour <= 23
            && minutes >= 0 && minutes <= 59){
            minutes = minutes + 15;
            if(minutes >= 60){
                minutes = minutes - 60;
                hour++;
                if(hour >= 24){
                    hour = hour -24;
                }
            }
            if(minutes < 10){
                System.out.printf("%d:0%d", hour,minutes);
            }else{
                System.out.printf("%d:%d",hour,minutes);
            }

        }

    }
}
