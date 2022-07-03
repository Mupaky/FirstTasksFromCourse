package whileloopexercise;

import java.util.Scanner;

public class AOldBooks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String favoriteBook = scanner.nextLine();
        String bookInBible = scanner.nextLine();
        int booksChecked = 1;
        boolean bookFounded = false;

        while (!bookInBible.equals("No More Books")){
            if(bookInBible.equals(favoriteBook)){
                booksChecked--;
                System.out.printf("You checked %d books and found it.", booksChecked);
                bookFounded = true;
                break;
            }else{
                bookInBible = scanner.nextLine();
                booksChecked++;
            }
        }

        if(bookInBible.equals("No More Books") && bookFounded == false){
            booksChecked--;
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksChecked);
        }

    }
}
