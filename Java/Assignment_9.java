import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("select option 1 for language bengali\n" + //
                "select option 2 for language hindi\n" + //
                "select option 3 for language urdu");
        int ft=in.nextInt();
        switch (ft) {
            case 1:
                System.out.println("Bengali");
                break;
            case 2:
                System.out.println("English");
                break;
            case 3:
                System.out.println("Urdhu");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}
