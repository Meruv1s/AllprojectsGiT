
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.ObjectOutputStream;
    import java.io.*;
    
    public class a37 {
         public static void main(String []args)
         {
   //   Student stu1= new Student(1, "rohan",16);
   // stu1.disp();
    try{
      //FileOutputStream fos= new FileOutputStream("D:\\telusko\\io\\serial.txt");
     //  BufferedOutputStream boos= new BufferedOutputStream(fos);
     //  ObjectOutputStream oos = new ObjectOutputStream(boos);//fos or boos// oos coverts object in to series of bytes and through fos we are passsing on to file
      // oos.writeObject(stu1);
    //
     // System.out.println("please check the file to see serialized object");
     //  oos.close();
     //  fos.close();

     FileInputStream fis= new FileInputStream("D:\\telusko\\io\\serial.txt");
    BufferedInputStream bis= new BufferedInputStream(fis);
    ObjectInputStream ois = new ObjectInputStream(bis);
    Student st=(Student)ois.readObject();
    st.disp();


    ois.close();
    fis.close();
    }
    catch(FileNotFoundException e)
    {
        System.out.println("not found");
    }
    catch (Exception e)
    {
        System.out.println("Io exception");
    }
         }
    }
    
    class Student  implements Serializable
    
    {
        private int id;
        private String name;
       transient   private int age;
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
    

//
//selective seralization