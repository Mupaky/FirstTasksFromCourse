package forloopexercise;

import java.util.Scanner;

public class HTennisRanklist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double winPercent = 0;
        int totalPointsFromContests = 0;

        int totalContests = Integer.parseInt(scanner.nextLine());
        int startpoints = Integer.parseInt(scanner.nextLine());

        if(totalContests >= 1 && totalContests <= 20
            && startpoints >= 1 && startpoints <= 4000){
            for(int i = 0; i <= totalContests - 1; i++){
                String state = scanner.nextLine();
                if(state.equals("W")){
                    totalPointsFromContests += 2000;
                    winPercent++;
                }else if (state.equals("F")){
                    totalPointsFromContests += 1200;
                }else if(state.equals("SF")){
                    totalPointsFromContests += 720;
                }
            }

            System.out.println("Final points: " + (startpoints + totalPointsFromContests));
            System.out.println("Average points: " + (totalPointsFromContests / totalContests));
            System.out.printf("%.2f%%", ((winPercent / totalContests) * 100));
        }
    }
}
