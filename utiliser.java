import java.util.Scanner;

public class utiliser {
    public static void main(String arg[]) {
        double x = 0.0, y = 0.0, z = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x et y");
        x = sc.nextDouble();
        y = sc.nextDouble();
        try {
            z = Operations.diviser(x, y);
        } catch (Exception e) {
            z = 1.0E20;
            System.out.println(e + "je continue");
        }
        System.out.println("z= "+z);
    }
}
