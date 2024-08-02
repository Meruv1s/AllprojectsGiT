import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class a35 {
     public static void main(String []args)
     {
  Student stu1= new Student(1, "rohddddddn",15);
stu1.disp();
try{
   FileOutputStream fos= new FileOutputStream("D:\\telusko\\io\\serial.txt");
   BufferedOutputStream boos= new BufferedOutputStream(fos);
   ObjectOutputStream oos = new ObjectOutputStream(boos);//fos or boos// oos coverts object in to series of bytes and through fos we are passsing on to file
   oos.writeObject(stu1);

  System.out.println("please check the file to see serialized object");
   oos.close();
   fos.close();
}
catch(FileNotFoundException e)
{
    System.out.println("not found");
}
catch (IOException e)
{
    System.out.println("Io exception");
}
     }
}

class Student  implements Serializable

{
    private int id;
    private String name;
transient  private int age;
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

// serializatio and deserialization
/// securely transvering the data from ram to a file is called serialization
// serilaziable is a markable interface and hatever class to the object belong s to should implemenet this interface