import java.sql.*;
public class a25 extends Object {
    public static void main(String []args)
    {
        String la=new String(
            "kukka");  // Sring is an class and all other are its methods here we are passing it by using construter
          System.out.println(la);
          System.out.println(la.charAt(0));
          System.out.println(la.length());
          System.out.println(la.concat("pandi"));  
        
            String ne = "navin";  // basicallly strings are immutable and they store there data in heap memory with speacial concept called  string constant bool 
            String ne1="Navin";
             ne =ne + "reddy";  // in this line the address is changed and the full string is assigned with the new address
            boolean ha= ne==ne1;
            System.out.println(ha);
            System.out.println(ne);
           
         //============================= String buffer or muttable string
           StringBuffer sa = new StringBuffer("vdcjd");  // Striung buffer is thread safe and string builder is not thread safe
           System.out.println(sa.append("sbjd"));
           System.out.println(sa.length());
          String da= sa.toString();
          System.out.println(da);
          System.out.println(sa.deleteCharAt(2));
          System.out.println(sa.insert(0,"k"));
           sa.setLength(20);
           System.out.println(sa.length());
           System.out.println(sa.append("sbjjjjjd"));
           System.out.println(sa.length());
    }
    
}
