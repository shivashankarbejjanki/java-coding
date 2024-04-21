import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Compound Interest Calculation");
        System.out.print("Enter value of p: ");
        int p = sc.nextInt();
        System.out.print("Enter value of T: ");
        float t = sc.nextFloat();
        System.out.print("Enter value of R: ");
        float r = sc.nextFloat();

        double Ci = p * Math.pow((1 + r / 100), t);

        System.out.println("Compound Interest is: " + Ci);
    }

}
