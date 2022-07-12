import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a hora: ");
        int hour = sc.nextInt();
        Message.greetings(hour);

        ////////////////////////////////////

        System.out.println("Calculadora!");
        System.out.println("Insira dois números: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("\nOperações: ");
        Operacoes.sum(a, b);
        Operacoes.minus(a, b);
        Operacoes.multiply(a, b);
        Operacoes.divide(a, b);

        ////////////////////////////////////

        System.out.println("Empréstimos: ");
        System.out.println("Insira um valor para ver as parcelas do empréstimo: ");
        double value = sc.nextDouble();
        Loan.calculate(value, Loan.getTwoParcels());
        Loan.calculate(value, Loan.getThreeParcels());

    }
}
