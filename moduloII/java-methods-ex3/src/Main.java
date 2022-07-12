import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Retornando valores");

        System.out.println("Insira um valor para calcular a área do quadrado: ");
        double areaQuadrado = sc.nextDouble();
        System.out.println("Área do quadrado = " + Quadrilatero2.area(areaQuadrado));

        System.out.println();

        System.out.println("Insira 2 valores para calcular a área do retângulo: ");
        double l1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        System.out.println("Área do Retângulo = " + Quadrilatero2.area(l1, l2));

        System.out.println();

        System.out.println("Insira 3 valores para calcular a área do trapézio: ");
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Área do Trapézio = " + Quadrilatero2.area(b1, b2, h));

    }
}
