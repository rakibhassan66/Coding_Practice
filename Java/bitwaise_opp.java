import java.util.Scanner;

public class bitwaise_opp {
    public static void main(String[] args) {
        int c;
        Scanner jol = new Scanner(System.in);
        System.out.println("Insert your digits ");
        int a = jol.nextInt();
        int b = jol.nextInt();
        c = a^b;
        System.out.println("Bitwise EXOR : "+c);
        c = a>>b;
        System.out.println("Bitwise right shift >> : "+c);
        c = a<<b;
        System.out.println("Bitwise left shift  << : "+c);
        c = a&b;
        System.out.println("Bitwise And : "+c);
        c = a|b;
        System.out.println("Bitwise OR : "+c);
        c = ~a;
        System.out.println("Bitwise not : "+c);
    }
}
