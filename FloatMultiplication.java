import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Float Multiplication");

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        float mul = num1 * num2;
        System.out.println("Float Multiplictaion: " + mul);
    }

}
