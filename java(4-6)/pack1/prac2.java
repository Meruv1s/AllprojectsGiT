package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prac2 {
      public static void main(String []args)

      
      {

        List<emp> a = new ArrayList<emp>();
        a.add ( new emp(4,3));
        a.add ( new emp(3,3));
        a.add ( new emp(2,3));
        a.add ( new emp(1,3)); 
        System.out.println(a);
        for (emp b: a)
        {
   b.dis();
        }
          Collections.sort(a);
          System.out.println(a);
      }
}

class emp  implements Comparable<emp>

{
    int age;
    int no;
    @Override
    public String toString() {
        return "emp [age=" + age + ", no=" + no + "]";
    }
    public emp(int age, int no) {
        this.age = age;
        this.no = no;
    }
      public void dis()
      {
        System.out.println("hello" + age);
      }
      public int compareTo(emp o)

      {
        if(this.age >o.age)
        {
            return 1;
        }
        else 
        {
           return -1;
        }
      }
}
