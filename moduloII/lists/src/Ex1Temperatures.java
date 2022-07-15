import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1Temperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> temperature = new ArrayList<>();
        int media = 0;
        System.out.println("Insira as temperaturas dos 6 primeiros meses do ano: ");
        for (int i = 0; i < 6; i++){
            double entrada = sc.nextDouble();
            temperature.add(entrada);
            media += entrada;
        }

        media /=  6;
        System.out.println("Média das 6 primeiras temperaturas do ano: " + media);

        for(Double x : temperature){
            if(x > media){
                switch (temperature.indexOf(x)) {
                    case 0 -> System.out.println((temperature.indexOf(x) + 1) + " - Janeiro");
                    case 1 -> System.out.println((temperature.indexOf(x) + 1) + " - Fevereiro");
                    case 2 -> System.out.println((temperature.indexOf(x) + 1) + " - Março");
                    case 3 -> System.out.println((temperature.indexOf(x) + 1) + " - Abril");
                    case 4 -> System.out.println((temperature.indexOf(x) + 1) + " - Maio");
                    case 5 -> System.out.println((temperature.indexOf(x) + 1) + " - Junho");
                }
            }
        }
    }
}
