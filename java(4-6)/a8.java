public class a8 {
    public static void main(String []args)
    {
     Runnable obj1= new Runnable()
  {

    public void run()
    {
     for(int i=0;i<5;i++)

     {
        System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
    }
        
     };
    Runnable obj2= new b();
   
     Thread t1= new Thread(obj1);
     Thread t2= new Thread(obj2);
     t1.start();
     t2.start();
    
       
     }
    }

/*class a implements Runnable {
  public void run()
  {
     for(int i=0;i<5;i++)

     {
        System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
  }
}*/
class b implements Runnable {
  public void run()
  {
    for(int i=0;i<5;i++)

     {
        System.out.println("hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
  }
}
//runnable vs thresad with lamda exp
// thread class implemenets  runnable interface  and runnable interface extendsobject class
