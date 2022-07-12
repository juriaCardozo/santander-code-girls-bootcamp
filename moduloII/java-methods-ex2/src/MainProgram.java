import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor para calcular a área do quadrado: ");
        double areaQuadrado = sc.nextDouble();
        Quadrilatero.area(areaQuadrado);

        System.out.println();

        System.out.println("Insira 2 valores para calcular a área do retângulo: ");
        double l1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        Quadrilatero.area(l1, l2);

        System.out.println();

        System.out.println("Insira 3 valores para calcular a área do trapézio: ");
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double h = sc.nextDouble();
        Quadrilatero.area(b1, b2, h);

        System.out.println();

        System.out.println("Insira 2 valores para calcular a área do losango: ");
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        Quadrilatero.area(d1, d2);

    }
}
