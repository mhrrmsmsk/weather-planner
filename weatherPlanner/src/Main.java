import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int temp ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a weather temperature:");
        temp = input.nextInt();

        if (temp<5){
            System.out.println("You should go sking");
        } else if (temp>=5 && temp<15) {
            System.out.println("You should go to cinema ");
            
        } else if (temp>=15 && temp<25) {
            System.out.println("You should go to picnic");

        } else if (temp>=25) {
            System.out.println("You should go swimming");
            
        }

    }
}