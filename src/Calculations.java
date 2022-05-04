import java.util.*;

public class Calculations {
    public static void main(String[] args) {
        Cal ();
    }
    //method to calculate
    public static void Cal () {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number one");

        int numOne = input.nextInt();

        System.out.println("Enter number two");
        
        int numTwo = input.nextInt();

        int totalOne = numOne + numTwo;
        int totalTwo = numOne - numTwo;
        int totalThree = numOne * numTwo;
        float totalFour = (float) numOne / numTwo;
        int totalFive = numOne % numTwo;;

        System.out.println(numOne + " + " + numTwo + " = " + totalOne);
        System.out.println(numOne + " - " + numTwo + " = " + totalTwo);
        System.out.println(numOne + " * " + numTwo + " = " + totalThree);
        System.out.println(numOne + " / " + numTwo + " = " + totalFour);
        System.out.println(numOne + " % " + numTwo + " = " + totalFive);

        input.close();
    }
}
