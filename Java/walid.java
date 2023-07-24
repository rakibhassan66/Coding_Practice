import java.util.Scanner;

public class walid
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int nEmployee, hWorked;
		float hSalary;
		
		nEmployee = sc.nextInt();
		hWorked = sc.nextInt();
		hSalary = sc.nextFloat();
		
		float tSalary = hWorked * hSalary;
		
		System.out.println("NUMBER = " + nEmployee);
		System.out.printf("SALARY = U$ %.2f\n", tSalary);
		
		sc.close();
	}
}