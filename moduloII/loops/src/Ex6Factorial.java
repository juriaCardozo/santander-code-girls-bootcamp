import java.util.Scanner;

public class Ex6Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número para ser calculado o fatorial: ");
        int n = sc.nextInt();
        int fatorial = 1;

        for(int i = n; i > 0; i--){
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);
    }
}
