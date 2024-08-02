import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class a11 {
    public static void main(String []args)
    {
     Set<Integer> nums= new HashSet<Integer>();
     nums.add(6);
     nums.add(2);
     nums.add(6);
     nums.add(1);
  System.out.println();
    Iterator<Integer> values=nums.iterator();  // another wasy to print values
      while(values.hasNext())
      System.out.println(values.next());

  
     for(int n:nums)
     {
        System.out.println(n);
     }
    }
}
// set concept
// set is used to store unique vlaues
// it doesnot give repeated output and the op is not in sorted order
//and it cant have index value
// if you want it in sorted order uyse treeset instead of hashset