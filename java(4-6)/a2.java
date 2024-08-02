public class a2 {
     public static void main (String [] args)
     {
       
     int i=2;
     int j=0;   
     String s=null;

     int arr[]=new int[3];
    
   try{
 System.out.println(s.length());
 j=18/i;
  System.out.println(arr[3]);
   }
   catch(ArithmeticException e)
   {
System.out.println("dbsksd"+e);
 }
  catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("dbsksd"+e);
   }
   catch(Exception e)
   {
    System.out.println("dbsksd"+e);
   }
  finally
  {

  }
 
   System.out.println(j);
   System.out.println("bye");
}
   


}
// exceptions
// errors 3 types 
// compile time , runtime and logical errors
// write critical state ments in try block if there is exception it will go to catch and execute it and 
// executes the remaining part
// arthimetic exception extends runtime exceptions and it extendends excepion class it extends trowable it implements serialixble interface
 
 