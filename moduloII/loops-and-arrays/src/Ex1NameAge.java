import java.util.Scanner;

public class Ex1NameAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age = 0;

        while(true){
            System.out.println("Name: ");
            name = sc.next();
            if(name.equals("0")){
                break;
            }
            System.out.println("Age: ");
            age = sc.nextInt();
        }
        System.out.println("End!");
    }
}
