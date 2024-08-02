public class a9
{
    public static void main(String []args) throws InterruptedException
    {
      counter c = new counter();
      
      Runnable obj1= () ->
  {
    for(int i=0;i<1000;i++)
    {
    
    c.increment();
    }
    };
   
  
      Runnable obj2= () ->
  {
    for(int i=0;i<1000;i++)
    {
    
    c.increment();
    }
    
  };
  Thread t1= new Thread(obj1);
      Thread t2 = new Thread(obj2);
      t1.start();
      t2.start();
     t1.join();
     t2.join();// join is used to wait for the other therad to complte its work

       System.out.println(c.count);
    }

    }

class counter 
{
  int count;
    public synchronized void increment()// syncronized is ude to save from race conditiion

  {
    count++;

  }
}
// if two threads reach the scheduler at the same time then in the two threads only one thread is executed 
// so thats why you see less increment value so if we used syncronised then we overcome race condition

// thread states new->start-> runnable->run()-> running->sleep()orwait()-> waiting
// runnable to dead state use stop() method
