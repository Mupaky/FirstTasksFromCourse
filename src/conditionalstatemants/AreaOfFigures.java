package conditionalstatemants;

import java.util.Scanner;

public class AreaOfFigures {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if(figure.equals("square")){
            double wight = Double.parseDouble(scanner.nextLine());
            System.out.format("%.3f", wight * wight);
        }
        if(figure.equals("rectangle")){
            double wight = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.format("%.3f", wight * height);
        }
        if(figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.format("%.3f", Math.PI * (radius * radius));
        }
        if(figure.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.format("%.3f", a * height / 2);

        }

    }
}
