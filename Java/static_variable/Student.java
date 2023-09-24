
package static_variable;


public class Student {
    
    
    String name;
    int ID;
    static String universityName = "Daffodil International University";
    
    // Constructor to initialize name and ID
    Student(String a, int b) {
        name = a;
        ID = b;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("University: " + universityName);
    }
    
    
}
