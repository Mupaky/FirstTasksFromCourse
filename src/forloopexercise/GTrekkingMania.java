package forloopexercise;

import java.util.Scanner;

public class GTrekkingMania {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        double musala = 0;
        double monblan = 0;
        double kalimandjaro = 0;
        double kTwo = 0;
        double everest = 0;
        double totalPeople = 0;

        if(groups >= 1 && groups <= 1000){
            for(int i = 0; i <= groups - 1; i ++){
                int groupNum = Integer.parseInt(scanner.nextLine());
                if(groupNum >= 1 && groupNum <= 1000){
                    totalPeople += groupNum;
                    if(groupNum <= 5){
                        musala += groupNum;
                    }else if(groupNum >= 6 && groupNum <= 12){
                        monblan += groupNum;
                    }
                    else if(groupNum >= 13 && groupNum <= 25){
                        kalimandjaro += groupNum;
                    }
                    else if(groupNum >= 26 && groupNum <= 40){
                        kTwo += groupNum;
                    }
                    else{
                        everest += groupNum;
                    }
                }

            }

            System.out.printf("%.2f%%\n", ((musala / totalPeople) * 100));
            System.out.printf("%.2f%%\n", ((monblan / totalPeople) * 100));
            System.out.printf("%.2f%%\n", ((kalimandjaro / totalPeople) * 100));
            System.out.printf("%.2f%%\n", ((kTwo / totalPeople) * 100));
            System.out.printf("%.2f%%\n", ((everest / totalPeople) * 100));

        }
    }
}
