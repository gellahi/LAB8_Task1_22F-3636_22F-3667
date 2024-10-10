public class Calculator {

    public int addition(int num1, int num2) {
        if (validateInput(num1, num2)) {
            return num1 + num2;
        } else {
            System.out.println("Invalid input for addition.");
            return -1;
        }
    }

    public int multiplication(int num1, int num2) {
        if (validateInput(num1, num2)) {
            return num1 * num2;
        } else {
            System.out.println("Invalid input for multiplication.");
            return -1;
        }
    }

    public boolean validateInput(int num1, int num2) {
        return num1 >= 0 && num2 >= 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.addition(5, 10);
        int product = calculator.multiplication(5, -10);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        System.out.println("Base Calculator setup complete.");
    }
}
