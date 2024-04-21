import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Area of Triangle calculation");
        System.out.print("Enetr the base value: ");
        float base = sc.nextFloat();
        System.out.print("Enter the height of triangle: ");
        float height = sc.nextFloat();

        float area = 0.5f * base * height;
        System.out.println("Area of the Triangle: " + area);
    }

}
