import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Arithmatic calculator");
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is: " + add);
        System.out.println("Subraction is: " + sub);
        System.out.println("multiplication: " + mul);
        System.out.println("Division is: " + div);
        System.out.println("Module is: " + mod);
    }

}
