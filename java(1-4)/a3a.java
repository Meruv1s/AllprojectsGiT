public class a3a {
    

    public static void main( String [] args)

{  
 ammai l= new ammai();
 System.out.println(l.kj);

//a2 k= new a2();
//System.out.println(k.lappakai);// only a2 is possible array is not possible no errors will be shown but compilation is failed

ab q = new ab();
q.m1();

 q.m2(q);

 new ab().m1();
 ab.m2(q);


}}
class ab 
{
    int a;
    static int b=2;
    public void m1()
    { ab obj = new ab();
        a=6;
        obj.a=10;
   System.out.println(a+""+b);

   new ab().b=5;

   System.out.println(new ab().a + ""+ new ab().b);
   System.out.println(ab.b);
   System.out.println( obj.a + ""+obj.b );
   //m2(obj);
    
    }
    public static void m2( ab q)
    {
        System.out.println(q.b+" "+q.a + " " + ab.b + b);
        q.m3();
    }
    public void m3()
    {

    }
    public static void m4()
    {

    }
}


class ammai
{
    int kj=6;
    public void m1()

    {

    }
}