
import java.io.*;
public class a31 {
  public static void main(String []args)  throws IOException
  {
      String fp="D:\\telusko\\io\\java.txt";
  FileReader reader= null;
      try
      
    {
   File f1= new File(fp);
reader= new FileReader(f1);

////////////////////////////////////  1st way

int i= reader.read();// returns integer value// get character one by one
//System.out.println((char)i);// converts in to char
while(i!=-1)
{   System.out.print(i+"=>");
    System.out.println((char)i);
    i=reader.read();


}
/////////////////////////////////////////////  2nd way
char ch[]= new char[(int)f1.length()];
reader.read(ch);
for(char c:ch)

{
    System.out.println(c);
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
// how to read a file
