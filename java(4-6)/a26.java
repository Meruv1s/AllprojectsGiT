import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a26 {
    public static void main(String [] args)
    {
   List<String> names= Arrays.asList("Navin", "Harsh");

       // 1st way
       List<String> uNames= names.stream().map(name->name.toUpperCase()).toList(); // to list method converts streams in to a list and we 
       // store it in a list again
       uNames.forEach(System.out :: println);
       System.out.println(uNames);

    List<student> students= new ArrayList<>();
    // by normal 
    for(String name:names)
    {
      students.add( new  student(name));
    }
   System.out.println(students);


   // by using stream api
      students=names.stream().map(name-> new student(name)).toList();
   System.out.println(students);

   // By using constructer reference
   students=names.stream().map(student:: new).toList();
   System.out.println(students);
    }
}

class student
{
    private String name;
        private int  age;
        public student() {
        }
        public student(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "student [name=" + name + ", age=" + age + "]";
        }


}
// constructer reference