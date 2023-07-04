import java.util.Scanner;

public class Arethmetic_opperation {

    public static void main(String[] args) {

        try (Scanner del = new Scanner(System.in)) {
            double num1,num2,result;
            System.out.println("Please inter your digit to 1 st number");
            num1 = del.nextDouble();

            System.out.println("Please inter your digit to 1 st number");
            num2 = del.nextInt();

            result = num1 + num2;
            System.out.println("Total result is  "+result);

            result = num1 - num2;
            System.out.println("Total result is  "+result);

            result = num1 / num2;
            System.out.println("Total result is  "+result);

            result = num1 * num2;
            System.out.println("Total result is  "+result);
            
            result = num1 % num2;
            System.out.println("Total result is  "+result);
        }
        
        ;
    }
}