package conditionalstatemants2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#");

        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSecondsOneMeter = Double.parseDouble(scanner.nextLine());
        double timePerDistance = 0;
        double timeWaterResist = 0;

        if(recordSeconds >= 0.00 && recordSeconds <= 100000.00
                && distanceMeters >= 0.00 && distanceMeters <= 100000.00
                && timeSecondsOneMeter >= 0.00 && timeSecondsOneMeter <= 1000.00){
            timePerDistance = distanceMeters * timeSecondsOneMeter;
            if(distanceMeters >= 15){
                timeWaterResist = Integer.parseInt(df.format(distanceMeters / 15));
                timeWaterResist = timeWaterResist * 12.5;
            }


            double total = timePerDistance + timeWaterResist;
            double notEnough;
            if(recordSeconds <= total){
                notEnough = total - recordSeconds;
                System.out.printf("No, he failed! He was %.2f seconds slower.", notEnough);
            }if(recordSeconds > total){
                notEnough = recordSeconds - total;
                System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total);
            }


        }


    }

}
