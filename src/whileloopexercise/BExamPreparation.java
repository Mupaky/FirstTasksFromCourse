package whileloopexercise;

import java.util.Scanner;

public class BExamPreparation {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int notEnoughGoodGrades = Integer.parseInt(scanner.nextLine());
        int notEnoughGoodGradesChecker = 0;

        boolean isSucceed = true;

        double averageGrade = 0;
        int numberOfTasks = 0;
        String lastTask = null;

        if(notEnoughGoodGrades >= 1 && notEnoughGoodGrades <= 5){

            String namelastTask = scanner.nextLine();

            while (!namelastTask.equals("Enough")){

                int grade = Integer.parseInt(scanner.nextLine());

                if(grade >= 2 && grade <= 6){
                    averageGrade += grade;
                    numberOfTasks++;
                    lastTask = namelastTask;
                    if(grade <= 4){
                        notEnoughGoodGradesChecker++;
                        if(notEnoughGoodGradesChecker == notEnoughGoodGrades){
                            isSucceed = false;
                            break;
                        }
                    }
                }

                namelastTask = scanner.nextLine();

            }
            if(isSucceed){
                System.out.printf("Average score: %.2f\n", (averageGrade/numberOfTasks));
                System.out.println("Number of problems: " + numberOfTasks);
                System.out.println("Last problem: " + lastTask);
            }else{
                System.out.printf("You need a break, %d poor grades.", notEnoughGoodGradesChecker);
            }
        }
    }
}
