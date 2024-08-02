package pack1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class prac4 {
    public static void main(String [] args)
    
    
    {
       List<Integer> nums =Arrays.asList(2,3,4,5,6);// new ArrayList<>(); 
       System.out.println(nums);
       int  a = nums.stream().map(n->n*2).filter(n->n%2==0).reduce(0,(c,e)->c+e);
       Stream<String>  a1= nums.stream().map(n->n*2 + "su");
       System.out.println(a1);
       Stream<Integer> sortedvalues = nums.stream().sorted();
sortedvalues.forEach(n->System.out.println(n));
    }
}
