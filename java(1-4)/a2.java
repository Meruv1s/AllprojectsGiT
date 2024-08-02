
//mport tools1.*;
public class a2 {
 int lappakai=9;
    public static void main(String []args)
    {  ammai l= new ammai();
        System.out.println(l.kj);
    
     int arr[][]= new int[4][3];

     for (int i=0; i<arr.length;i++)
     {
        for (int j=0; j<arr[i].length ;j++)
        {
            arr[i][j]= (int)( Math.random()*10);
            System.out.println(arr[i][j]);
        }
     }
     for (int ar[]: arr)
     {
        for(int d :ar)
        {
            d=(int)( Math.random()*10);
            System.out.println(d);
        }
     }
     array obj =new array();
     obj.ae=3;
     obj.ae1=4;

     array obj1 = new array();
     obj1.ae=6;
     obj1.ae1=7;

     array arr2[]=new array[2];
     arr2[0]= obj;
     arr2[1]=obj1;
     
     for(array s :arr2)
     {
        System.out.println(s.ae + "" + s.ae1);
        s.m1();
     }
    }
}
class array
 {
  int ae;
  int ae1;
   public void m1()
   {

 System.out.println("Hello");
  
   }

 }

 
 //
 //1)when ever an object is instanciated fist the staic block is called and all the static variables and static methods are stored in class loader
 //and the ststic block is called when we cretae that object for the first time
//2)next all the instance variables and instance methods get stored in the heap memory
//3) nexxt the constructer is called but this constructer will be called everytime when an object is intiantiated

class ammai
{
    int kj=6;
    public void m1()

    {

    }
}
