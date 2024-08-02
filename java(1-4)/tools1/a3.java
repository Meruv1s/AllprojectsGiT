package tools1;
public class a3 {
 public static int d=7;
    public static void main(String[]args)
    {
         System.out.println(sta.b);
      /* System.out.println(new sta().a);
        System.out.println(sta.b);

        //===================
        sta gh =  new sta();
        gh.a =5;
        sta.m2(gh);
        new sta().m1();
        new sta().m2(gh);
        //===================== */
        sta gh1= new sta() ;
        sta gh =  new sta();
        gh1.a=5;
        gh.a=2;

          gh1.m1();
          gh.m1();
          gh.m2(gh1);
          gh1.m3();

    }
    
}





 class sta
{ int a=2;
    static int b=3;
    public void m1()
    {
 System.out.println( a+ "" + b);
 System.out.println( new sta().a + " "+ new sta().b);
 System.out.println(sta.b);
    }
public static void m4()
{

}

    public static void m2(sta o)
    {
System.out.println( o.a + "" + b + "" + o.b);
o.m1();
m4();
    }
  public void m3()
  { m1();
    m4();


  }
}
//static conceppt