import java.util.Scanner;
public class Quotient {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if(number2 == 0){
            System.out.println("Denominator can't equal zero!");
        } else {
            System.out.println(number1 + "/" + number2 + " is " + (number1 / number2));
        }
    }
}
