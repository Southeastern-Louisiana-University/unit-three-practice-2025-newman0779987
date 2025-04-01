import java.util.Scanner;

public class QuotientException {
    public static int quotient(int num1, int num2){
        if (num2 == 0){
            throw new ArithmeticException("Divisor can't be 0!");
        }
        return num1/num2;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try{
            int result = quotient(num1,num2);
            System.out.println("num1 / num2 is " + result);
        }
        catch (ArithmeticException exception) {
            System.out.println("Exception: division by zero!");
        }

        System.out.println("Execution continues...");

    }
}
