public class a7 {
    
    public static void main( String [] args)

    {
    a obj1=new a();
    b obj2= new b();
     //System.out.println(obj1.getPriority());
    // obj1.setPriority(Thread.MAX_PRIORITY);
    obj1.start();   // start and run methods with extention of thread is mandatory foe executing threads
    
  try {
    Thread.sleep(2);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
    obj2.start();
    System.out.println("bye");
    }
}

class a extends Thread
{
    public void run()
    {
  for(int i=0;i<1000;i++)

  {
    System.out.println("hii"+i);
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
    }
}
class b extends Thread{
    public void run()
    {
  for(int i=0;i<1000;i++)

  {
    System.out.println("hello"+i);
    try {
        Thread.sleep(10);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
  }
    }
}
// thread- it performs multiple tasks at the same  time
// we can see the performance of the threds in task manger
// threads belongs to java.lang package
