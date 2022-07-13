import java.util.Scanner;

public class Ex2Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char[] array = new char[6];
//        int consonant = 0;
//
//        System.out.println("Insira 6 caracteres: ");
//        for(int i = 0; i < array.length; i++){
//            array[i] = sc.next().charAt(0);
//            if(array[i] != 'a' && array[i] != 'e' && array[i] != 'i' && array[i] != 'o' && array[i] != 'u'){
//                consonant++;
//            }
//        }
//
//        System.out.println("O vetor tem " + consonant + " consoantes: ");
//        for (char c : array) {
//            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
//                System.out.print(" " + c);
//            }
//        }

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = sc.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);
    }
}
