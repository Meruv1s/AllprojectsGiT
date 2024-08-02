package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class prac1 {
     public static void main(String [] args)

{
 
     com b= new com()
     {
        public int compare( Integer a,Integer b)

        {
      return (a%10 >b%10)  ? 1 :-1;
        }
     };

      List<Integer> a = new ArrayList<Integer>();
      a.add(2);
      a.add(3);
      a.add(4);

      Collections.sort(a,b);

}    }


class com implements Comparator<Integer>
{
    public int compare( Integer a,Integer b)

    {
  return (a%10 >b%10)  ? 1 :-1;
    }
}