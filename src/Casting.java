public class Casting {
    public static void main(String[] args) throws Exception {
   
        Cast();
     
    }

    //method for casting
    public static void Cast () {

        double myDouble = 112.35;
        int myInt = (int) myDouble;
        String myNum = "49";
        int myIntTwo = Integer.parseInt(myNum);

        System.out.println("Double: "+ myDouble);
        System.out.println("int: " + myInt);
        System.out.println("--------------------");
        System.out.println("The string value is: " + myNum);
        System.out.println("The integer value is: " + myIntTwo);
    }
}
