import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a14 {
    public static void main(String [] args)


{

    Comparator<String> comp = new Comparator<String>()// compaarator is a interface
        {
            public int compare(String i, String j)  // Interger because collections works with tghe wrapper classes
            {
         if(i.length() > j.length())
             return 1; // its swaps
         else 
           return -1; // its doesnt swaps


            }
        };// comparator is a interface
    List<String> nums = new ArrayList<String>();
    nums.add("bvcwwwwwwwwwwwwwwwwwwws");
    nums.add("bksdb");
    nums.add("sumanthmeruva");
    Collections.sort(nums,comp);
    System.out.println(nums);
}}
// comparator and compare