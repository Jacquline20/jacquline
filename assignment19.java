public class ExceptionExample {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {
            // Arithmetic exception
            int result = 10 / 0;
            System.out.println("Result = " + result);

            // Array index exception
            System.out.println(numbers[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: Index is out of range.");
        }

        finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
