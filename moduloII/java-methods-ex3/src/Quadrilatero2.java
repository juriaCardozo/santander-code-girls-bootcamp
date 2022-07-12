public class Quadrilatero2 {

    public static double area(double l1) {
        return l1 * l1;
    }

    public static double area(double l1, double l2) {
        return l1 * l2;
    }

    public static double area(double bMaior, double bMenor, double altura) {
        return (bMaior + bMenor) * altura / 2;
    }

}