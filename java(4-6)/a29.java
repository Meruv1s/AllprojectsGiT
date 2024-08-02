import java.io.*;

public class a29 {
    public static void main(String []args)


{  String filepath="D:\\telusko\\io\\java.txt";
    String Dirpath="D:\\telusko\\io\\Dir";
    try{
  File f1= new File(filepath);// we have added java.txt file
   System.out.println(f1.exists());
 // System.out.println( f1.createNewFile());
   System.out.println(f1.getPath());// gives path
   System.out.println(f1.isDirectory());// referring to path or direxctory so false
  System.out.println(f1.isFile()); //true


////////////////////////////////////////////////////////////////

   File dir= new File(Dirpath);// Dir is a  folder
   System.out.println(dir.exists());
  // dir.mkdir();
 //  System.out.println(dir.exists());
 System.out.println(dir.isDirectory());// referring to path or direxctory so true
 System.out.println(dir.isFile());//fale

 /////////////////////////////////////////////////////
    File f2= new File("C:\\Users\\suman\\java(4-6)");
    String str[]=f2.list();// displays all files
   int c=0; 
  for(String name :str)
  {c++;
    System.out.println(name);
  }
   System.out.println(c);
}
    catch(Exception e)

{
  System.out.println("no problem");  
}
}
}
// fundamenatls before io operation
// file handkling
// how to add a file in folder

