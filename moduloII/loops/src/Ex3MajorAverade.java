import java.util.Scanner;

public class Ex3MajorAverade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        double major = 0;
        double average = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Insira o número " + i + ": ");
            numbers[i] = sc.nextInt();
            if(numbers[i] > major){
                major = numbers[i];
            }
            average += numbers[i];
        }

        average /= 5;

        System.out.println("Média dos números inseridos: " + average);
        System.out.println("Maior número inserido: " + major);
    }
}
