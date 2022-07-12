public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Área do quadrado = " + lado * lado);
    }

    public static void area(double lado, double lado2) {
        System.out.println("Área do Retângulo = " + lado * lado2);
    }

    public static void area(double bMaior, double bMenor, double altura) {
        System.out.println("Área do Trapézio = " + (bMaior + bMenor) * altura / 2);
    }

    public static void area(float diag1, float diag2){
        System.out.println("Área do Losango = " + (diag1 * diag2) / 2);
    }
}
