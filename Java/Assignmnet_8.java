import java.util.Scanner;

public class Assignmnet_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("have you completed your masters? yes/no ");
        String df = in.nextLine();
        System.out.println("Are you fulent in English? yes/no");
        String tf = in.nextLine();
        if((df.equals("yes")) && (tf.equals("yes"))){
            System.out.println("You are eligible to for the job interview");
        }
        else{
            System.out.println("Sorry. you are not eligible to for the job interview");
        }
    }
}
