package forloopexercise;

import java.util.Scanner;

public class ESalary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tabsNum = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        String tab;

        if(tabsNum >= 1 && tabsNum <= 10
            && salary >= 500 && salary <= 1500){
            for(int i = 0; i <= tabsNum - 1; i++){
                tab = scanner.nextLine();
                if(tab.equals("Facebook")){
                    salary -= 150;
                }else if(tab.equals("Instagram")){
                    salary -=100;
                }else if(tab.equals("Reddit")){
                    salary -= 50;
                }
                if(salary < 0){
                    System.out.println("You have lost your salary.");
                    break;
                }
                if(i == tabsNum - 1){
                    System.out.println(salary);
                }
            }
        }
    }
}
