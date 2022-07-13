import java.util.Random;
import java.util.Scanner;

public class Ex3Random {
    public static void main(String[] args) {
//        Random gen = new Random();
//
//        int[] array = new int[20];
//
//        for(int i = 0; i < args.length; i++){
//            int number = gen.nextInt(100);
//            array[i] = number;
//        }
//
//        System.out.println("Números aleatórios gerados: ");
//        for(int number : array){
//            System.out.print(number + " ");
//            System.out.print((number + 1) + " ");
//        }

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
