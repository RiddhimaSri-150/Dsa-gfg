class A{
    public A(){
        super();
        System.out.println("imn ma");
    }
    public A(int n){
        this();
        System.out.println("in jhjgkjd integer");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("imn mabgfi");
    }
    public B(int n){
        super(4);
        System.out.println("in B integer");
    }
}
public class Poly {
    public static void main(String[] args) throws ClassNotFoundException {
        B obj = new B(4);
     }
}