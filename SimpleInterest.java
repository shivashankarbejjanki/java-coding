import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Interest Calculation");
        System.out.print("Enter value of p: ");
        float p = sc.nextFloat();
        System.out.print("Enter value of T: ");
        float T = sc.nextFloat();
        System.out.print("Enter value of R: ");
        float R = sc.nextFloat();

        double Si = (p * T * R) / 100;

        System.out.println("Simple Interest is: " + Si);
    }

}
