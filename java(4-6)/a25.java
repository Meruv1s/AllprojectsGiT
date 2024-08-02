import java.util.Arrays;
import java.util.List;

public class a25 {
    public static void main(String[] args)
    {

    
       List<String> names= Arrays.asList("Navin", "Harsh");

       // 1st way
       List<String> uNames= names.stream().map(name->name.toUpperCase()).toList(); // to list method converts streams in to a list and we 
       // store it in a list again
       System.out.println(uNames);

       // 2nd way
       List<String> na=names.stream().map(String::toUpperCase).toList();
       na.forEach(System.out :: println);
    }
      
}
// method reference 
// passing a class name and its method to be called inside a method is called method reference