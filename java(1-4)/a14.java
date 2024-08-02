
public class a14 {
      public final  static int a=6;
    public static void main (String []args)
    {
        int hj=2;
        Integer hj1= new Integer(2); // (autoboxing)    //new Integer(hj);  (boxing)
        System.out.println(hj1.intValue()+ "" + hj1);
        int hj2= hj1.intValue();  //(auto unboxing)  //hj1.intValue();  //unboxing
 
      
        System.out.println(hj2);
         String str ="23";
         int hj3 = Integer.parseInt(str); // parse int is a static nmethod so we can aceess it by using class name
         
         System.out.println(hj3);
    }
    
}// wrapper class//
//storing the data IN THE RESPECTUUVE CLASS OBJECT IS CALLED AUTO BOXING


