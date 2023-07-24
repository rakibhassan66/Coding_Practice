import java.util.Scanner;

public class assignment_7_logicalopp {
    public static void main(String[] args) {
        Scanner cos = new Scanner(System.in);
        System.out.println("Are you a java lover ?");
        System.out.println("Press Y/y\nIf you are not then\nPress n/N");
        char cd = cos.next().charAt(0);
        if (cd =='y'||cd=='Y') {
            System.out.println("You are a java lover");
        }
        else if (cd=='n'||cd=='N') {
            System.out.println("You are not a java lover");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
