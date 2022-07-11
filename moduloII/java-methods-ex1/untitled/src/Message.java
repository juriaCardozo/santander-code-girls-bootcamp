public class Message {

    public static void greetings(int hour){
        if(hour >= 5 && hour <= 11){
            System.out.println("Bom dia!\n");
        }else if(hour >= 12 && hour <= 17){
            System.out.println("Boa tarde!\n");
        }else if(hour >= 18 && hour <= 24 || hour >= 1 && hour <= 4){
            System.out.println("Boa noite!\n");
        }
    }

}
