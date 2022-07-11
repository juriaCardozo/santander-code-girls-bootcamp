import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora!");
        System.out.println("Insira dois números: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        Operacoes.sum(a, b);
        Operacoes.minus(a, b);
        Operacoes.multiply(a, b);
        Operacoes.divide(a, b);

        ////////////////////////////////////




    }
}
