import java.util.*;

public class BoilingWater {
    public static void main(String[] args) {
        BoilingorNot();
    }

    public static void BoilingorNot () {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number greater than 212");

        int num = input.nextInt();

        if (num < 212) {
            System.out.println("Water is not boiling");
        }else {
            System.out.println("Water is boiling!");
        }
        input.close();
    }
}
