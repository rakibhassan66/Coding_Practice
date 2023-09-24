
package oop.types_of_constructor;


public class test2 {
    
    public static void main(String[] args) 
    {
        teacher2 t1 = new teacher2("Sakib Kaka",23,"CSE",5632154,"Male");
        t1.di();
        
        teacher2 t2 = new teacher2("Sakib Kaka",23,"CSE",5632154,"Male");
        t2.di();
        
        teacher2 t3 = new teacher2();
        t3.di();
    }
    
}
