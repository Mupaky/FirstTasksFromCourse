package forloopexercise;

import java.util.Scanner;

public class FOscars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String actionName = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());

        double pointsActor = pointsAcademy;

        if(pointsAcademy >= 2 && pointsAcademy <= 450.5
            && jury >= 1 && jury <= 20){
            for (int i = 0; i <= jury - 1; i++){
                String juryName = scanner.nextLine();
                double juryPoints = Double.parseDouble(scanner.nextLine());
                if(juryPoints >= 1 && juryPoints <= 50){
                    pointsActor += ((juryName.length() * juryPoints) / 2);
                    if(pointsActor > 1250.5){
                        break;
                    }
                }
            }
            if(pointsActor > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                        actionName, pointsActor);
            }else {
                System.out.printf("Sorry, %s you need %.1f more!",
                        actionName, (1250.5 - pointsActor));
            }
        }
    }

}
