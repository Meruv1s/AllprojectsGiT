import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a13 {
    public static void main(String [] args)
    {  sto o= new sto() {
        public int compare(Integer i, Integer j)  // Interger because collections works with tghe wrapper classes
        {
     if(i%10 > j%10)
         return 1; // its swaps
     else 
       return -1; // its doesnt swaps


        }
    };
    
        Comparator<Integer> comp = new Comparator<Integer>()// compaarator is a interface
        {
            public int compare(Integer i, Integer j)  // Interger because collections works with tghe wrapper classes
            {
         if(i%10 > j%10)
             return 1; // its swaps
         else 
           return -1; // its doesnt swaps


            }
        };// comparator is a interface
   List<Integer> nums= new ArrayList<>();
   nums.add(42);
   nums.add(36);
   nums.add(45);
   nums.add(23);
    
   Collections.sort(nums);
   Collections.sort(nums,o);
   /*Collections.sort(nums,(i,j)->{  if(i%10 > j%10)
       return 1; // its swaps
    else 
      return -1;});*/ // collections is a static class and it has lot of methods 
    // since it is a static class we are are calling it by using its class name
   System.out.println(nums);

    }
}
class sto
implements Comparator<Integer>{
    public int compare(Integer i, Integer j)  // Interger because collections works with tghe wrapper classes
    {
 if(i%10 > j%10)
     return 1; // its swaps
 else 
   return -1; // its doesnt swaps
    }
        
}