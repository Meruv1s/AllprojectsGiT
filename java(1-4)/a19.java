public class a19 {
    public static void main(String [] args)
    
    {
        computer  la = new lap();
        // lap la = new lap(); we can use any one np problem
desk de = new desk();


 devp az= new devp();
 az.devp1(de ); 

    }
}
interface  computer //abstract class computer      
{
     void code();// public abstract  void code();


}
      class lap implements computer //class lap extends computer
{
    public void code ()
    {
        System.out.println("code");
    }
}
     class desk implements computer//            class desk extends computer
{
    public void code()
    {
 System.out.println("code1");
    }
}
class devp
{
    public void devp1(computer la)   //(lap la ) or ( desk de)

    {
     la.code();
    }
}
//need for interface