import java.util.Scanner;

public class split
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String[] input;
		int code, unit;
		float price, toBePaid;

		input = sc.nextLine().split(" ");
		code = Integer.parseInt(input[0]);
		unit = Integer.parseInt(input[1]);
		price = Float.parseFloat(input[2]);

		toBePaid = price * unit;

		

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", toBePaid);

		sc.close();
	}
}