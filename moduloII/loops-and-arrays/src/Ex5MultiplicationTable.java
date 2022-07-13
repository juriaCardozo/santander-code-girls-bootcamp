import java.util.Scanner;

public class Ex5MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número de 1 a 10:");
        int n = sc.nextInt();
        while(n > 10 || n < 1){
            System.out.println("Insira um número válido: ");
            n = sc.nextInt();
        }

        int i;

        switch (n) {
            case 1:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + n + " = " + i * n);
                }
                break;
            case 2:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 2 + " = " + i * n);
                }
                break;
            case 3:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 3 + " = " + i * n);
                }
                break;
            case 4:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 4 + " = " + i * n);
                }
                break;
            case 5:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 5 + " = " + i * n);
                }
                break;
            case 6:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 6 + " = " + i * n);
                }
                break;
            case 7:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 7 + " = " + i * n);
                }
                break;
            case 8:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 8 + " = " + i * n);
                }
                break;
            case 9:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 9 + " = " + i * n);
                }
                break;
            case 10:
                for(i = 1; i <= 10; i++){
                    System.out.println(i + " x " + 10 + " = " + i * n);
                }
                break;
        }
    }
}
