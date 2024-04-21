import java.util.Scanner;

public class PerimeterOfRect {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation of perimeter");

        System.out.println("Enter all sides of Rectangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int perimeter = a + b + c + d;

        System.out.println("Perimeter of a Rectangle: " + perimeter);

    }

}
