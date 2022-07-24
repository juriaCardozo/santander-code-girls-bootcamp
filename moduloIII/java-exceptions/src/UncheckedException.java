import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
            //e.printStackTrace();
        }finally {
            System.out.println("Finally!");
        }


        System.out.println("Segue aqui ainda...");
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}
