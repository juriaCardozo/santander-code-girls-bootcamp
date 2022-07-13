import java.util.Scanner;

public class Ex1Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[6];

        for(int i = 0; i < array.length; i++){
            System.out.println("Insira o valor " + i + " para ser inserido no vetor: ");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Vetor inverso: ");
        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
