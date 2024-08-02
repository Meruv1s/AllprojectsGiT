import java.io.*;

public class a34 {
   public static void main(String []args) throws IOException
   
   {  
    String fp="D:\\telusko\\io\\java.txt";
    FileWriter writer= null;
    PrintWriter pwriter=null;
        try
        
      {
     File f1= new File(fp);
     writer = new FileWriter(f1,true);
     pwriter = new PrintWriter(writer);
     pwriter.write(65);
     pwriter.println("JAVA");
     pwriter.println('A');
     pwriter.println(true);
     pwriter.println(33.5);

      }
      catch (Exception e)
      {
          System.out.println("some problem");
      }
      finally{
    pwriter.close();
      }
    }  
   }
 // write operation using print writer

