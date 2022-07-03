package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class HOnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourStudent = Integer.parseInt(scanner.nextLine());
        int minuteStudent = Integer.parseInt(scanner.nextLine());

        if(hourExam >= 0 && hourExam <= 23 &&
            minuteExam >= 0 && minuteExam <= 59 &&
                hourStudent >= 0 && hourStudent <= 23 &&
                minuteStudent >= 0 && minuteStudent <= 59){
            int minutes;
            int hour;

            if(hourStudent == hourExam){
                if(minuteStudent == minuteExam){

                    System.out.println("On time");

                }else if(minuteStudent > minuteExam){

                    System.out.println("Late");
                    System.out.printf("%d minutes after the start",
                            minuteStudent - minuteExam);
                }else{
                    if(minuteExam - minuteStudent <= 30){

                        System.out.println("On time");
                        System.out.printf("%d minutes before the start",
                                minuteExam - minuteStudent);
                    }else {
                        System.out.println("Early");
                        System.out.printf("%d minutes before the start",
                                minuteExam - minuteStudent);
                    }
                }

            }else if (hourStudent > hourExam){
                hour = hourStudent - hourExam;

                if(hour == 1){
                    if(minuteStudent < minuteExam){

                        System.out.println("Late");
                        System.out.printf("%d minutes after the start",
                                60 - (minuteExam - minuteStudent));
                    }else if(minuteStudent == minuteExam){

                        System.out.println("Late");
                        System.out.println("1:00 minutes after the start");
                    }else{
                        minutes = 60 - (minuteStudent - minuteExam);
                        System.out.println("Late");
                        if(minutes < 10){
                            System.out.printf("%d:0%d hours after the start", hour, minutes);
                        }else{
                            System.out.printf("%d:%d hours after the start", hour, minutes);
                        }
                    }
                }else if (hour > 1){
                    if(minuteStudent < minuteExam){
                        hour--;
                        minutes = 60 - (minuteExam - minuteStudent);

                        System.out.println("Late");

                        if(minutes < 10){
                            System.out.printf("%d:0%d minutes after the start", hour, minutes);
                        }else{
                            System.out.printf("%d:%d minutes after the start", hour, minutes);
                        }


                    }else if(minuteStudent == minuteExam){
                        System.out.println("Late");
                        System.out.println("1:00 minutes after the start");
                    }else {
                        minutes = minuteStudent - minuteExam;

                        System.out.println("Late");
                        if(minutes < 10){
                            System.out.printf("%d:0%d minutes after the start", hour, minutes);
                        }else{
                            System.out.printf("%d:%d minutes after the start", hour, minutes);
                        }
                    }
                }


            }else {
                hour = hourExam - hourStudent;
                if(hour >= 1){
                    if(minuteStudent == minuteExam){
                        System.out.println("Early");
                        System.out.printf("%d:00 hours before the start", hour);
                    }else if (minuteStudent > minuteExam){
                        minutes = 60 - (minuteStudent - minuteExam);
                        if(minutes <= 30){
                            System.out.println("On time");
                            if(minutes < 10){
                                System.out.printf("%d minutes before the start", minutes);
                            }else {
                                System.out.printf("%d minutes before the start", minutes);
                            }
                        }else {
                            System.out.println("Early");
                            System.out.printf("%d minutes before the start", minutes);
                        }
                    }else{
                        minutes = minuteExam - minuteStudent;
                        System.out.println("Early");
                        if(minutes < 10){
                            System.out.printf("%d:0%d hours before the start", hour, minutes);
                        }else {
                            System.out.printf("%d:%d hours before the start", hour, minutes);
                        }

                    }
                }
            }


        }

    }
}
