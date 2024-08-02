
import java.io.*;
public class a30 {

    public static void main(String []args) throws IOException

    {
   String fp= "D:\\telusko\\io\\java.txt";
     FileWriter writer=null;
     try
     {
        File f1= new File(fp);
        writer= new FileWriter(f1,true);
        writer.write("java dhana is good girl");
        writer.write("\n");
        writer.write('s');// a is stored
        char c[]= {'a','e','i','o'};
        writer.write(c);



     }
     catch(Exception e)
     {
  System.out.println("some prroblem");
     }
     finally
     
     {
        writer.close();
     }
    }
    
}
// writing in a file

