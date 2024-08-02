import java.util.ArrayList;
import java.util.List;

public class a16 {
    public static void main(String []args)
    
    {
   String stu[]= new String[5];
   stu[0]="rohan";
   stu[1]="rohan";
   //stu[2]=10; compile time error

   
  String names=stu[0];
  String names1=stu[1];

  //  list  (Notypesafety)
  ArrayList     student= new ArrayList();
student.add("sumanth");
student.add("namratha");
student.add("madhu");
student.add(10);
    String name1= (String)student.get(0);
    System.out.println(name1.toUpperCase());
    String name2= (String)student.get(3);// runtime error
    System.out.println(name2.toUpperCase());
    // list with typessfety
    ArrayList<String>     student1= new ArrayList<String>();
    student1.add("sumanth");
    student1.add("namratha");
    student1.add("madhu");
   //student1.add(10); //compile time error as we used typesafety
        String namea= (String)student1.get(0);
        System.out.println(namea.toUpperCase());
        String nameb= (String)student1.get(2);
        System.out.println(nameb.toUpperCase());
    }
}
// generics
