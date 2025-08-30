
public class Example1 {

    public static void infiniteRecursion() {
        // This method calls itself infinitely
            infiniteRecursion();
        }

    public static void main(String[] args) {
        try {
            // Dividing by zero gives an error
            int x = 10;
            int y = 0;
            System.out.println("Result of x/y = " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        try {

            String text = null;
            // calling a method in a null object
            int length = text.length();

        } catch (NullPointerException e) {
            System.out.println("Nullpointer error");
        }

        try {

            int[] numbers = {10, 20, 30}; // This array has indexes 0, 1, and 2

            // This line will throw an ArrayIndexOutOfBoundsException because index 3 is out of bounds
            System.out.println(numbers[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        

    

        try {

            infiniteRecursion();

        } catch (ArithmeticException e) {
            System.out.println("Infinite");
        }

    System.out.println (

"After catch statement");
    }
}
