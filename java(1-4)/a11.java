public class a11 {
    public static void main(String []args)
    {
   

    }
    void m1()
    {

    }

    
    int m1(int a) // method over loading 
    {
 return a;
    }
}
class poly  extends a11
{

  public   int m1(int a) // method over ridding
    {  System.out.println("smdl");
return a;
    }
}
// poly means many morpism means behaviours 
// An object showing differen behaviours at different times based on the object intiation is called polymorpism
// we have 2 types of polyorpisms compile time and run time
// compile time polymorpism is also called as method overloading
// run time polymorpism is also called as method overriding