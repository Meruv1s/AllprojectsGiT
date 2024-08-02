package pack1;

import java.util.ArrayList;
import java.util.List;

public class prac3 {
       public static void main(String [] args)
       {
         List<dad> da = new ArrayList<dad>();
           dad da1= new dad(2,4);
           dad da2= new dad(3,4);


           List<mom> ma = new ArrayList<mom>();
          
           mom ma1= new mom(4,4);
           mom ma2= new mom(5,4);
           da.add(da1);
           da.add(da2);
           ma.add(ma1);
           ma.add(ma2);

     ko(ma);
       }
       public static void ko(List<? extends dad> L)
       {
   System.out.println(L);
    for( dad d : L)
    {
       System.out.println(d);
       d.dis();
    }
       }
}
  class  dad{

  int age ;
  int no;
public dad(int age, int no) {
    this.age = age;
    this.no = no;
}
@Override
public String toString() {
    return "dad [age=" + age + ", no=" + no + "]";
}
public void dis()
{
  System.out.println("sumanth" + age + no);
}
  public dad()
  {

  }
  }
   class mom extends dad{

  int age;
  int no1;
@Override
public String toString() {
    return "mom [age=" + age + ", no1=" + no1 + "]";
}
public mom(int age, int no1) 
{
    this.age = age;
    this.no1 = no1;
}
public void dis()
{
  System.out.println("sumanth" + no + age  + no1);
}
}
  

   
   