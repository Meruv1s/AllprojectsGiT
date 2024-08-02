public class a15 {
    public static void main(String []args)
    {
        abstr a = new abstr2();
        a.drive();
        a.seat();
      a.belt();
    }
    
}


abstract class abstr   // 1) we can not create an object for an abstract class 
//2)in the child classs every abstarctmethod should be defined
//3) in an abstract class we can have abstract methods as well as normal methods
//4)abstract is nothing but declaringv the methbods in abstract class and definingv them in another class

{
   int a;
 abstract void seat();
  public abstract void belt();


    public void drive()
    {

    }


}
 abstract class abstr1 extends abstr
  {
    void seat()  //point to be remembered
     {
System.out.println("seatr");
     }
     
  }
  class abstr2  extends abstr1
  {
    public void belt()
    {
System.out.println(":belt");
    }
  }
  //// absttraction