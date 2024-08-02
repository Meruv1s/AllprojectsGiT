import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class a20 {
   public static void main(String []args)
   {
   List<Integer> nums =Arrays.asList(2,3,4,5,6);// new ArrayList<>();

  Stream<Integer> s1= nums.stream();

 Stream<Integer> s2=s1.filter(n->n%2==0); //nums.stream( ) returns the value of stream
 Stream<Integer> s3=s2.map(n -> n*2);
 int result=s3.reduce(0,(c,e)-> c+e);
 System.out.println(result);
  //s3.forEach(n->System.out.println(n));
 // s1.forEach(n->System.out.println(n)); nums.foreach no error but s1.foreach we get error stream of water when passees cant get back // we cant reuse stream
// 1st way
   for(int n:nums)
   {
    System.out.println(n);
   }
        
   // 3rd way

//nums.forEach(n-> System.out.println(n));// what exactly is this forexach meathod takkes an object of consumer and consumer is an interface
Consumer<Integer> con= new Consumer<Integer>()
{
  public void accept(Integer n)
  {
 System.out.println(n);
  }
};
nums.forEach(con);


// 2nd way
/*for(int i=0;i<nums.size();i++)
{
  System.out.println(nums.get(i));
}

  System.out.println(nums);
  int sum=0;

  for(int n:nums)
  {
    if(n%2==0)

    {
        n=n*2;
        sum=sum+n;
    }
  }

  System.out.println(sum);*/
   } 
}
// Stream api
// for each
// Stream is an interface it has many mamny methods like filter,reduce...
