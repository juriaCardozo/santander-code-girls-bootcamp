import java.util.Scanner;

public class Ex2Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade;

        System.out.println("Nota: ");
        grade = sc.nextInt();

        while(grade >10 ||grade < 0){
            System.out.println("Valor inválido, tente novamente!");
            grade = sc.nextInt();
        }
    }
}
