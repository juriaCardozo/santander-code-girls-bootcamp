import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2Crime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> answer = new ArrayList<>();
        int yes = 0;
        int soma = 0;

        System.out.println("Responda as perguntas da investigação: ");
        System.out.println();
        System.out.println("Telefonou para a vítima? (0-no/1-yes)");
        answer.add(sc.nextInt());
        System.out.println("Esteve no local do crime? (0-no/1-yes)");
        answer.add(sc.nextInt());
        System.out.println("Mora perto da vítima? (0-no/1-yes)");
        answer.add(sc.nextInt());
        System.out.println("Devia para a vítima? (0-no/1-yes)");
        answer.add(sc.nextInt());
        System.out.println("Já trabalhou com a vítima? (0-no/1-yes)");
        answer.add(sc.nextInt());

        for (int x : answer) {
            soma += x;
        }

        System.out.println();
        if(soma == 2){
            System.out.println("Você é um suspeito!");
        }else if(soma == 3 || soma == 4){
            System.out.println("Você é um cúmplice!");
        }else if(soma == 5){
            System.out.println("Você é o assassino!");
        }else{
            System.out.println("Você é inocente");
        }
    }
}
