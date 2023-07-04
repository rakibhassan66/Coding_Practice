import java.util.Scanner;
public class java_input {

    public static void main(String[] args) {
        Scanner del = new Scanner(System.in);
        System.out.println("Ohaio Punk this Naval\nI'm an AI\nI need your name to continue ..");
        System.out.println("Name :");  
        String brad = del.nextLine();
        System.out.printf("Hello %s , Welcome to AI Universe\nI'm here to assist you",brad);
        System.out.println("Here for your password insert your iD ");
        int num = del.nextInt();
        System.out.printf("Here is your digits : %d",num);

        del.close();
    }
} 