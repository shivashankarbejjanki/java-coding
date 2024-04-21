import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Fahrenheit to Celsius Calculation");
        System.out.print("Enter value of F: ");
        float f = sc.nextFloat();

        float Celsius = (f - 32) * 5 / 9;
        System.out.println("F to C is: " + Celsius);
    }

}
