import java.util.Random;

public class Ex4MultidimensionalArray {
    public static void main(String[] args) {
//        Random random = new Random();
//
//        int[][] array = new int[4][4];
//
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                array[i][j] = random.nextInt(9);
//            }
//        }
//
//        System.out.println("Matriz: ");
//        for(int[] line : array){
//            for(int column : line){
//                System.out.print(column + " ");
//            }
//            System.out.println();
//        }

        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++) {
            for( int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}