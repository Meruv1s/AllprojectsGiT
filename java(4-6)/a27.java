import java.util.Date;

public class a27 {
    public static void main(String [] args)
    {
        // Display date and time
     Date d= new Date();// or
     java.util.Date d1 = new java .util.Date();
   System.out.println(d1);
     System.out.println(d);
       // Display  time

       long time=d.getTime();
       System.out.println(time);// it display time in milli seconds
 


// 2nd way in java .sql package
      java.sql.Date sdate= new java.sql.Date(time);
      System.out.println(sdate);// so the date clas of sql package diplays ony time where as date class of til package diaplays both date abd time


    }
}
// date and time
// date and time ara available in java .util and java .sql packages so we can immport them and use them
// after java 8 they have created  apackage called time
// this paclages are depricated now so now thay are using java.util.time package
