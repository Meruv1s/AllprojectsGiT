import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a5 {
    public static void main(String []args) throws IOException// It is udes when we use InputStreamreader

    {
     InputStreamReader in = new InputStreamReader(System.in);
BufferedReader bf = new BufferedReader(in);

int num= Integer.parseInt(bf.readLine());
System.out.println(num);
bf.close();








      Scanner sc = new Scanner(System.in);
       int num1=sc.nextInt();
     String myString = sc.next();
       System.out.println(num1);
      System.out.println(myString);
    }
}

// how system.out.println works
//println is a method and out is an obj which is a static object present in system class 
// so we can call println method using syso

