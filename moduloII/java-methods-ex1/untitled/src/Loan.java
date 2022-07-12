public class Loan {
    public static int getTwoParcels(){
        return 2;
    }

    public static int getThreeParcels(){
        return 3;
    }

    public static double getFeeTwoParcels(){
        return 0.2;
    }

    public static double getFeeThreeParcels(){
        return 0.45;
    }

    public static void calculate(double value, int parcels){
        if(parcels == 2){
            double finalValue = value + (value * getFeeTwoParcels());
            System.out.println("Valor do empréstimo para 2 parcelas: R$" + finalValue);
        }else if(parcels == 3){
            double finalValue = value + (value * getFeeThreeParcels());
            System.out.println("Valor do empréstimo para 3 parcelas: R$" + finalValue);
        }else{
            System.out.println("Quantidade de parcelas não aceita!");
        }
    }

}
