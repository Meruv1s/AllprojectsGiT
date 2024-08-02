import java.util.ArrayList;

public class a17 {
    public static void main(String []args)
    {
          Student stu = new Student(1,"sumanth");
          Student stu1 = new Student(2,"sumddddanth");
          Employee stu2 = new Employee(1,"sumanth");
          Employee stu3 = new Employee(1,"sumanth");
          ArrayList<Student> list = new ArrayList<>();
          list.add(stu);
              list.add(stu1);
             // list.add(stu2); compile time error as we mentioned type safety as student

    }
    
}
class Employee

{
    private int id;
    private String name;
    public Employee(int id, String name) {
        super();

        this.id = id;
        this.name = name;
    }

}
class Student

{
    private int id;
    private String name;
    public Student(int id, String name) {
        super();
        
        this.id = id;
        this.name = name;
    }

}