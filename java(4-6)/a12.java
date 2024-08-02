import java.util.HashMap;
import java.util.Map;

public class a12  {

    public static void main(String[]args) 
    {
        
        Map<String,Integer> students = new HashMap<>();// we can also use hashtable instead of hashmap when we have multiple threads running at same time i.e syncronized concept
        students.put("navin",26);
        students.put("nafffvin",34);
        students.put("navigfn",25);
        students.put("navin",29);// here we gave 2 keys with same name so it takes the last one

    
        System.out.println(students.values());
        System.out.println(students);
        System.out.println(students.get("navin"));
        System.out.println(students.keySet());
        for(String name:students.keySet())
        {
            System.out.println(name +" : "+ students.get(name));
        }
    }
    
}
//map- It is a collection of key value pair
// basically it ois a combination of both set and list because the key values which is set are unique and values which are not unique are list
