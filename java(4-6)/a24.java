import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class a24 {
  
    public static void main(String []args)

    {
        List<String> names= Arrays.asList("Naxvin","Lakshmimi", "jogn");
        Optional<String> name = names.stream().filter(str->str.contains("x")).findFirst();// if the letter x is not their then we get null point exception so 
        //optional class will handle it so we get optional exception
       // System.out.println(name.get());
       // System.out.println(name.orElse("not found"));// if the name has x then it prints all vlaues other wise prints not found


       
        //other way

     //   String name = names.stream().filter(str->str.contains("x")).findFirst().orElse("not found");
      //  System.out.println(name);
    
    }
}
//optional class
