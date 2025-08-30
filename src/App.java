public class App {
    public static void main(String[] args){
        try {
            
            int x = 10;
            int y = 0;
            System.out.println("Result of x/y = " + (x/y));
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        System.out.println("After catch statement");
    }
}
