package forlooplab;

import java.util.Scanner;

public class FVowelsSum {



    public static void main(String[] args) {

        int a = 1;
        int e = 2;
        int i = 3;
        int o = 4;
        int u = 5;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if(!str.isEmpty()){
            for(int index = 0; index <= str.length() - 1; index++){
                switch (str.charAt(index)){
                    case 'a':
                        sum = sum + a;
                        break;
                    case 'e':
                        sum = sum + e;
                        break;
                    case 'i':
                        sum = sum + i;
                        break;
                    case 'o':
                        sum = sum + o;
                        break;
                    case 'u':
                        sum = sum + u;
                        break;
                }

            }
            System.out.println(sum);
        }

    }
}
