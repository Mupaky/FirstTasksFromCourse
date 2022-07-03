package whilelooplab;

import java.util.Scanner;

public class HGraduation {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gradeYear = 0;
        int timesNotSucceed = 0;
        double averageGrade = 0;
        boolean graded = true;

        String name = scanner.nextLine();
        double grade;

        while (gradeYear < 12){
            grade = Double.parseDouble(scanner.nextLine());
            if(grade >= 2 && grade <= 6){
                gradeYear++;
                if(grade < 4){
                    timesNotSucceed++;
                    if(timesNotSucceed == 2){
                        graded = false;
                        break;
                    }
                    gradeYear--;
                    continue;
                }
                averageGrade += grade;
            }

        }
        if(graded){
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade / 12);
        }else {
            System.out.printf("%s has been excluded at %d grade", name, gradeYear);
        }

    }
}
