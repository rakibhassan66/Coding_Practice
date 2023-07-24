import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Insert your one digit intiger number to identify it's vericity");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("The number you have inserted is Even");
        }
        else{
            System.out.println("Inseted number is Odd");
        }
    }
}
