import java.util.*;

public class TestScores {
    public static void main(String[] args) {
        Test();
    }

    public static void Test () {

        Scanner input = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");

        int num = input.nextInt();

        if (num < 90 && num >= 80) {
            System.out.println("Your grade is a B");
        } else if (num >=90) {
            System.out.println("Your grade is an A");
        } else if (num <80 && num >=70) {
            System.out.println("Your grade is a C");
        }else if (num <70 && num >= 60) {
            System.out.println("Your grade is a D");
        }else {
            System.out.println("Your grade a F");
        }
        input.close();
    }
}
