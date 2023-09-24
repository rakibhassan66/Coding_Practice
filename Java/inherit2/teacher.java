
package inherit2;


public class teacher extends person{
    
    private String q;

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }
    void d1(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQ());
    }
    
}
