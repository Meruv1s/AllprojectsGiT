public class a22 {
    public static void main ( String [ ]args)
    {
        a obj = new a();
        obj.m1();
        a.b obj1 = obj.new b(); // for calling a method we use its object as reference 
      // here we are making  object as an reference for calling an inner claass
      obj1.m2();
      
    a.c obj2 = new a. c();  // we can call a static class by using class name
    obj2.m3();
    
    }
    
}
class a{
    public void m1()
 

    {
System.out.println("sjdsn");
    }
    class b{
        public void m2()
        {
System.out.println("svcns");
        }
    }
  static  class c{


        public void m3()
        {
            System.out.println("sdjbdjkkkk");
        }
    }
}
//inner class
