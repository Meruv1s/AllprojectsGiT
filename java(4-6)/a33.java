import java.io.*;

public class a33 {
   public static void main(String []args) throws IOException
   
   {
    String fp="D:\\telusko\\io\\java.txt";
    FileReader reader= null;
    BufferedReader br= null;
        try
        
      {
     File f1= new File(fp);
  reader= new FileReader(f1);
  br = new BufferedReader(reader);
 String str= br.readLine();// reads the whole line and stores in a string
    while(str !=null)

    {
        System.out.println(str);
        str= br.readLine();
    }
  
 
      }
      catch (Exception e)
      {
          System.out.println("some problem");
      }
      finally{
    reader.close();
      }
    }  
   }
    

// buffer reader and filee reader
// buffer is used to speed up the transfer proceas