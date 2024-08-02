public class a2a {

  
    public static void main(String [] args)
    {
        int i=20;
        int j=0;
      try{
        j=18/i;
        if(j==0)
        {
            throw  new ArithmeticException("kukka");
        }

        System.out.println("suskfbs");
      }
      catch(  ArithmeticException E)

      {
       System.out.println("sdhbsk"+ E);
     }
     catch(Exception E)

     {
      System.out.println("sdhbsk"+ E);
    }
      System.out.println("bye");
    }
}
// creating exception using throw keyword