
package oop.Constructors;

/**
 *
 * @author deadbrat
 */
public class teacher2 {
    String gender,name,subject;
    int age,number;
    
    teacher2(String a,int b,String c,int d,String e){
    
         name=a;
         age=b;
         subject=c;
         number=d;
         gender=e;
    }
    void di(){
         
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Subject "+subject);
        System.out.println("Sex "+gender);
        System.out.println("Number "+number);
        System.out.println("\n\n");
    
    }
    
}
