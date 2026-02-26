import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        double base, height;
        double areaCm, areaIn;

        Scanner sc = new Scanner(System.in);

        // Taking input in cm
        System.out.print("Enter base in cm: ");
        base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();

        // Area in square cm
        areaCm = 0.5 * base * height;

        // Convert cm² to inch²
        // 1 inch = 2.54 cm ⇒ 1 sq inch = (2.54 * 2.54) cm²
        areaIn = areaCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " 
                + areaIn + " and sq cm is " + areaCm);

        sc.close();
    }
}