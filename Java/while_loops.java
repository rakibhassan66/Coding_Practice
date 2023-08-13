import java.util.Scanner;

public class while_loops {
    public static void main(String[] args) {
        Scanner de = new Scanner(System.in);
        System.out.println("Please insert your loops values 1-10");
        int del=de.nextInt();
        int c=1;
        while (c<=del) {
            System.out.println(c+" Bangladesh");
                    c++;
        }
    }
}
