import java.util.Scanner;

 class add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for two numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Add the numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        input.close();
    }
}
