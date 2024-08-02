public class a13 {
    public static void main (String []args)
    {  
        v nu = new v1();  //upcasting
nu.m1();
nu.m3();


v1 ku = (v1) nu;  // downcasting
ku.m2();
ku.m1();
ku.m3();

ku.m1();
    }
}
class v
    {
       public void m1()
        {
            System.out.println("in Vhjsfbsjf");

        }
        public void m3()
        {System.out.println("asd");

        }

    }
    class v1 extends v
    
    {
        public void m1()
        {
            System.out.println("in V");

        } 
    public  void m2()
    {
        System.out.println("in v1");  
      }
}