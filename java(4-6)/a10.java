import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class a10 {
     public static void main(String [] args)

     {
        /*Collection<Integer> 0r */ 
        ArrayList<Integer> nums= new ArrayList<Integer>();
        nums.add(2);
        nums.add(4);
        nums.add(25);
        nums.add(24);
        nums.add(52);
        System.out.println(nums);
        for(int n:nums)
        {
            System.out.println(n);
        }

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(2));
        //////////////////////


        Collection nums1= new ArrayList();// it gives exception(Runtime error )because we have given string  for arraylist
        nums1.add(3);
        nums1.add(3);
        nums1.add(3);// to avoid that exception please specify dataatype after collection
        nums1.add("sbdjs");
        for(Object n:nums1)
        {
            int num=(Integer)n;
            System.out.println(num*2);
        }

     } 
}


// collection api-- concept()
// collection--interface // list queue and set extends collection interface
//collections--class
// LIst concept
// itterable  interface is extended by collection interfaceand collection interface  is extended by list interface and list is implemented by arraylist class so thats why we can write list insted of collection to access its features