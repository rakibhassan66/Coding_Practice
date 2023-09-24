
package overloading;


public class teacher {
    
    String name,gender;
    int id;
    
    teacher(){
    
        System.out.println("Null eroors");
        
    }
    
    teacher(String a,String b){
    
        name=a;
        gender=b;
        
    }
    
    teacher(int c){
    
        id=c;
        
    }
    void DI(){
    
        System.out.printf("Name : %s%nGender : %s%nID : %d%n",name,gender,id);
    
    }
    
    
}
