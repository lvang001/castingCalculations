import java.util.*;

public class SameOrNah {
    public static void main(String[] args) {
        Saying();
    }

    public static void Saying() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String wordOne = sc.nextLine();

        System.out.println("Enter another word: ");

        String wordTwo = sc.nextLine();

        if (wordOne.equals(wordTwo)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("They are not the same");
        }
        sc.close();
    }
}
