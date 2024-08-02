import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class a23

{
    public static void main(String []args)

    {  int size=10_000;

        List<Integer> nums= new ArrayList<>();
        Random ran= new Random();
        for(int i=1;i<=size;i++)
        {
            nums.add(ran.nextInt(100));
            
        }
      //  System.out.println(nums);
        
                int sum=nums.stream().map(i->i*2).reduce(0,(c,e)->c+e);
                
                long stseq1=System.currentTimeMillis();
        int sum1= nums.stream().map(i->{
            try{
            
                Thread.sleep(1);
            } 
            catch(Exception e)
            {}
            return i*2;
        }).mapToInt(n->n).sum();  //maptoint converts anytype of data type to integer and then we can use sum method // if we use sum method without using mapto int the we get error
        long endseq1=System.currentTimeMillis();
        long stseq2=System.currentTimeMillis();
  int sum2= nums.parallelStream().map(i->{
    try{
    
        Thread.sleep(1);
    } 
    catch(Exception e)
    {}
    return i*2;
}).mapToInt(n->n).sum(); 
  long endseq2=System.currentTimeMillis();
  System.out.println(sum +"  " + sum1 + "  "+ sum2);
  System.out.println(" seq time"+ ""+(endseq1-stseq1));
  System.out.println("parallee time"+ ""+(endseq2-stseq2));
    }
}
//parallel stream takes lesstime than sequence stream but if we use them in small operation example without giving delay in map than we can observe
// parallel stream takes more time its because it takes some time to create the thread