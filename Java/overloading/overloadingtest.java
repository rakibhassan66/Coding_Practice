
package overloading;

import java.util.Scanner;


public class overloadingtest {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Insert you Name ");
        String nm=sc.nextLine();
        System.out.print("Insert you Gender ");
        String gn=sc.nextLine();
        System.out.print("Insert you ID");
        int id=sc.nextInt();
        
        
        teacher t1 = new teacher();
        teacher t2 = new teacher(nm,gn);
        t2.DI();
        teacher t3 = new teacher(id);
        t3.DI();
        
        
    }
    
    
}
