import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class a21 {
    
    public static void main(String []args)
    {
        List<Integer> nums= Arrays.asList(2,3,4,5,6,7);
// how filter works  //filter needs an obj of predicate ehich is a interface which ahs a method test

Predicate<Integer> p = new Predicate<Integer>() {
  

  @Override
  public boolean test(Integer n) {
  return n%2==0;
  }
};
Stream<Integer> r1= nums.stream().filter(p);
r1.forEach(n->System.out.println(n));
    //  System.out.println(r1);   
// how map works// map needs an object of function which is an interface which ahs method apply
Function<Integer,String> fun= new Function<Integer,String>()
{
   public String apply(Integer n)
   {
    return n*2+"suman";

   }
};
Stream<String> r2=nums.stream().map(fun);
r2.forEach(n->System.out.println(n));

// how reduce works // it needs obj of binary interface 

Stream<Integer> sortedvalues = nums.stream().sorted();
sortedvalues.forEach(n->System.out.println(n));
//System.out.println(sortedvalues);

   //   int r=  nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
     // System.out.println(r);


    }
}
// stream api
// Dont use parallel stream using sorted becaude it needs all the elements to gether