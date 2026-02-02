public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        // Intentional bug for debugging practice
        int product = a - b; // This should be a * b
        System.out.println("The product of " + a + " and " + b + " is: " + product);
    }
}
