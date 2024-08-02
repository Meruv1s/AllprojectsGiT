public class a4 {
    
    public static void main(String []args)

    {
        a1 obj = new a1();
        
        a1 obj1 = new a1(); 
            try {
                obj.m1();
                System.out.println("Hi sumanth");
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
               // e.printStackTrace();
               System.out.println("fedf"+e);
            }
        
        
}
}
class a1 {
    public void m1 () throws ClassNotFoundException


    {
       // try
        
       // {
            Class.forName("a1");

       // }
      //  catch (ClassNotFoundException e)
       
       // {
       //     System.out.println("classs not found"+ e);
       // }
    }
}
