public class Test1 {
    private int l,b;
    public Test1(){
        l=10;
        b=20;
    }
    public Test1(int L,int B){
        l=L;
        b=B;
    }// Constructor Overloading
    public static void main(String[] args) {
        Test1 t1= new Test1();
        Test1 t2= new Test1(20,30);
        
        System.out.println("Dimemsions are " +t1.l + " " +t1.b);
        System.out.println("Another Object are "+ t2.l+" "+t2.b);
    }
}
