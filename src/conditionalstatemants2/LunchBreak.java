package conditionalstatemants2;

import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameMovie = scanner.nextLine();
        double episodeTime = Double.parseDouble(scanner.nextLine());
        double breakTime = Double.parseDouble(scanner.nextLine());
        double timeLunch;
        double timeRelax;

        if(episodeTime >= 10 && episodeTime <= 90
            && breakTime >= 10 && breakTime <= 120){
            timeLunch = breakTime * 0.125;
            timeRelax = breakTime * 0.25;
            double sum = timeLunch + timeRelax + episodeTime;
            if(sum <= breakTime){
                System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameMovie,  Math.ceil(breakTime - sum));
            }else{
                System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameMovie,  Math.ceil(sum - breakTime));
            }
        }
    }
}
