import java.util.Scanner;

class PowerUp {

    // Method to compute power
    public static double computePower(int base, int power) throws IllegalArgumentException {
        if (base < 0 || power < 0) {
            throw new IllegalArgumentException("Error: Base and power should not be negative.");
        }
        if (base == 0 || power == 0) {
            throw new IllegalArgumentException("Error: Base and power should not be zero.");
        }
        return Math.pow(base, power);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter base: ");
            int base = sc.nextInt();

            System.out.print("Enter power: ");
            int power = sc.nextInt();

            double result = computePower(base, power);
            System.out.println(base + " raised to the power " + power + " = " + result);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
        
        sc.close();
    }
}
