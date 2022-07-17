public class Calculadora implements OperacaoMatematica{
    public void soma(double valor1, double valor2){
        System.out.println("Soma: " + valor1 + valor2);
    }

    public void subtracao(double valor1, double valor2){
        System.out.println("Subtração: " + valor1 + valor2);
    }

    public void multiplicacao(double valor1, double valor2){
        System.out.println("Multiplicação: " + valor1 + valor2);
    }

    public void divisao(double valor1, double valor2){
        System.out.println("Divisão: " + valor1 + valor2);
    }
}
