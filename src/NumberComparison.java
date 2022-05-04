import java.util.*;

public class NumberComparison {
    public static void main(String[] args) {
        Compare();
    }

    public static void Compare() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");

        int firstNum = input.nextInt();

        System.out.println("Enter second number: ");

        int secondNum = input.nextInt();

        if (firstNum == secondNum) {
            System.out.println("The numbers are equal");
        } else if (firstNum > secondNum) {
            System.out.println("First number was larger than the first");
        } else {
            System.out.println("Second number was larger than the first");
        }
        input.close();
    }
}
