package conditionalstatementsadvancedlab2;

import java.util.Scanner;

public class FOperationBetweenNumbers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if(n1 >= 0 && n1 <= 40000 && n2 >= 0 && n2 <= 40000){
            double result;
            switch (operator){
                case "+":
                case "-":
                case "*":
                    if(operator.equals("+")){
                        result = n1 + n2;
                    }else if(operator.equals("-")){
                        result = n1 - n2;
                    }else{
                        result = n1 * n2;
                    }

                    String evenOdd;

                    if(result % 2 == 0){
                        evenOdd = "even";
                    }else{
                        evenOdd = "odd";
                    }

                    System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOdd);
                    break;
                case "/":
                    if(n2 == 0) {
                        System.out.printf("Cannot divide %d by zero", n1);
                        break;
                    }
                    result =(double)n1 / (double)n2;
                    System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
                    break;
                case "%":
                    if(n2 == 0) {
                        System.out.printf("Cannot divide %d by zero", n1);
                        break;
                    }
                    result = (double)n1 % (double)n2;
                    System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
                    break;
            }
        }


    }
}
