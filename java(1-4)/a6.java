public class a6 {
    public static void main(String [ ]args)
    {
        new c2(2);
    }
}
class c1
{
  public c1()
  {
    super();
 System.out.println("c1");
  }
  public c1(int a)
  { this();
 System.out.println("c1 int");
  }
}
class c2 extends c1
{
 public c2()
 { super();
System.out.println("c2");
 }
 public c2(int a)
 { super(2);
System.out.println("c2 int");
 }

 
}

// super and  then concept