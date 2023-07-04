import java.util.Scanner;

public class Assignment_3_product {
    public static void main(String[] args) {
        
        Scanner del = new Scanner(System.in);
        System.out.println("Product Title ");
        String title = del.nextLine();
        System.out.printf("The product is %s\n",title);
        System.out.println("Insert you ID number");
        int id = del.nextInt();
        System.out.printf("Your ID number is %d\n",id);
        System.out.println("Insert the product price ");
        double dol = del.nextDouble();
        System.out.printf("The price is %.2f",dol);
        del.nextLine();
        System.out.println("The variable want to descript write aabout it");
        String des = del.nextLine();
        System.out.println(des);
        
}
}