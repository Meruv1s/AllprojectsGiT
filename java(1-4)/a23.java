
public class a23 {
    
    public static void main(String []args)
    
    {
        int i=5;
        status s= status.running;
   System.out.println(s);
   System.out.println(s.ordinal());
   status k[] =  status.values(); // or s.values();
   System.out.println(k[1]);
   for(status s1 :s.values())


   {
    System.out.println(s1);
   }
  
   switch (s)

   {
    case running :
      System.out.println("bxjha");
      break;
      case failed :
      System.out.println("bxjha");
      break;
       default :
      System.out.println("bxjha");
      break;

   }
   if(s==status.running)
   {
    System.out.println("djnw");
   }


    else if (s== status.failed)

    {
        System.out.println("sncks");
    }
    else
    {
        System.out.println("kcsnx");
    }


    }
}
enum status

{
    running,failed,pending, sucess;

}
