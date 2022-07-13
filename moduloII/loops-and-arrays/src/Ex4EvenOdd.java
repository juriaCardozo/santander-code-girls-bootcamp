import java.util.Scanner;

public class Ex4EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números a ser inserida: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int number;

        for(int i = 0; i < n; i++){
            System.out.println("Insira o número " + i + ": ");
            number = sc.nextInt();
            if(number % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        System.out.println("Quantidade de números pares: " + even);
        System.out.println("Quantidade de números impares: " + odd);

    }
}
