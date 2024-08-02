public class a4 {
    public static void main( String []args)
    { 
   encap obj =new encap();
   obj.set(obj,2);
  // System.out.println(obj.a+ ""+obj.c + new encap().c);
    }
}
class encap
{
   private int a;
     public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
  private  int b;
   private int c;
    public int get()
    {
        return c;

    }
    public void set(encap obj,int c)
    {
        obj.c =c;
    }

}
// encap -- binding the data in to an single unit is called encapsulation
//what ever date we need to retrive we can get them through methods
