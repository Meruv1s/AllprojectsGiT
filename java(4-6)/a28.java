import java.time.*;

public  class a28 {
    
    public static void main(String [] args)
    {
   LocalDate date =LocalDate.now() ;// lacadate is  a class name and we are calling now method and returns returns type localdate
   System.out.println(date );
  int dayofmonth= date.getDayOfMonth();
  System.out.println(dayofmonth);
   int dayofyear=  date.getDayOfYear();
   System.out.println(dayofyear);
   int month=date.getMonthValue();
   System.out.println(month);
   int year = date.getYear();
   System.out.println(year);
                     
   LocalTime time =LocalTime.now();
   System.out.println(time);
   int hour=time.getHour();
   int min=time.getMinute();
   int sec= time.getSecond();
   System.out.println(hour + " "+min+ " "+ sec);
    }
}
 // now using new date and time api of java.time
