public class a20 {
    
    public static void main(String []args)
    {
        inter ax = new inter1();
  ax.i1();
  ax.i2();
 System.out.println(new inter1().y);
  System.out.println( inter.y);// as it is static and  final we can acces sthem by using interface name
 System.out.println(ax.y);
   
  //inter.y =6;// as oit is final we can not chnage the  variable value
    }
}
interface inter
{

   int y=6;   //In  interface all variable are final and static
   String z="cnsj";
    void i1();
    void i2();

}
class inter1 implements inter
{ public   void i1()
    {
        System.out.println(y);
  System.out.println("inshow");
    }
    public void i2()
    {
System.out.println("in show1");
    }

}