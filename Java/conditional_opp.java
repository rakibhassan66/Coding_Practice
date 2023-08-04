import java.util.Scanner;

public class conditional_opp {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Insert your diffential numbers one after another");
        int aa = sd.nextInt();
        int az = sd.nextInt();
        int large = (aa>az) ? aa:az;
        System.out.println("Large number is : "+large);
    }
}
