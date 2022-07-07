package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Type the first value: ");
        a = sc.nextInt();
        System.out.println("Type the second value: ");
        b = sc.nextInt();

        int sum = sum(a, b);
        int minus = minus(a, b);
        int multiply = multiply(a, b);
        int divide = divide(a, b);

        System.out.println("somar: " + sum);
        System.out.println("subtrair: " + minus);
        System.out.println("multiplicar" + multiply);
        System.out.println("dividir: " + divide);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int minus(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

}
