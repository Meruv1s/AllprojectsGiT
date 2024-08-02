import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.*;


public class a36 {
    public static void main(String [] rags)
    {
   try{
    FileInputStream fis= new FileInputStream("D:\\telusko\\io\\serial.txt");
    BufferedInputStream bis= new BufferedInputStream(fis);
    ObjectInputStream ois = new ObjectInputStream(bis);
    Student stu1=(Student)ois.readObject();

    System.out.println("hello");
    stu1.disp();


    ois.close();
    fis.close();
   }
   
   catch( IOException e)
   {
    
   }
   catch (Exception e)
   {

   }
   finally{
    
   }
    }
}
class Student  implements Serializable

{
    private int id;
    private String name;
   transient private int age;
    public Student(int id,String name, int age)


{
    this.id=id;
    this.name=name;
    this.age=age;

}
public void disp()
{
    
    System.out.println(id );
    System.out.println(name);
    System.out.println(age);
}
}

// deserialization
// reconstructing the object that has been stored in the file is called deserializartion


