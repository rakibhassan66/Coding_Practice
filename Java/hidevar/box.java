
package hidevar;


public class box {
    
    
    double height,waidth,depth;
    
    box(double height,double waidth,double depth){
    
        //using this help to hide variable to initial
        this.height = height;
        this.waidth = waidth;
        this.depth = depth;
        
    }
    
    void display(){
    
        double value = height*waidth*depth;
        System.out.println("The value is "+value);
        
    }
    
}
