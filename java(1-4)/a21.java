public class a21 {

   public static void main(String []args)
    
   {
   // x ak = new in1();
//ak. run();
in ad = new in1();
ad.show();
ad.congig();
   }
}

interface in{

    void show();
    void congig();

}
  class in1 implements in,y
{
     public void show ()
     {

     } public void congig()
     {

     }
     public void run()
    {

    }
     
}
  class in2 extends in1
  {
    public void run()
    {

    }
  }
interface x 
{
    void  run();
}  
interface y extends x{

}
