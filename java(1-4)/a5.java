 class ass {
    int a=6;
   protected int  b=6;
   void m1()
   {
System.out.println("bs");
   }
}
class ass1 extends ass{
   int k=7;
    void m2()
    {    System.out.println(a);
        System.out.println("bskc");
        System.out.println(a);

    } 

}public class a5{
  
    public static void main(String []args)
    {
       
        ass1 a =new ass1();
     //  a.k=6;
     a.a=5;
        a.m1();

    }
}
//inheritence
