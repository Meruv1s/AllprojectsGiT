import java.io.*;

public class a32 {
    public static void main(String [] args) throws IOException
    {
        String fp= "D:\\telusko\\io\\java.txt";
        FileWriter writer=null;
        BufferedWriter bwriter=null;
        try
        {
           File f1= new File(fp);
       
           writer = new FileWriter(f1,true);
        bwriter= new BufferedWriter(writer);
        bwriter.write("alien");
        bwriter.newLine();
        bwriter.write(66);
        char c[]= {'j','a'};
        bwriter.write(c);

        
        
   
        }
        catch(Exception e)
        {
     System.out.println("some prroblem");
        }
        finally
        
        {
           bwriter.flush();
           bwriter.close();

        }
       }
    }

// buffer writter and file writer