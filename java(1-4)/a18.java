//import tools1.*;

public class a18 {
    public static void main (String []args)
    {
 sta av = new sta();
 av.a=124;
 System.out.println(new sta().a + ""+ new sta().b);
 System.out.println(sta.b);
 System.out.println(av.a + ""+av.b);
 sta.m2(av);



 new sta().m1();

    }
    
}
class sta 
{
    int a =2;
    static int b=6;
    public void m1()
    {
       System.out.println( a + " "+b);
       System.out.println(new sta().a + new sta().b);
       System.out.println(sta.b);
   m3();
  
    }
    public static void m2(sta ab)
    {
System.out.println(b+ ""+ ab.a);

    }
    public void m3()
    {
 
    }
}// static concept repeat