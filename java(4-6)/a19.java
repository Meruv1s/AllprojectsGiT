import java.util.ArrayList;
import java.util.List;

public class a19 {
    

    public static void main(String[] args)
    {
   //Human hu= new Human();
   //Employee em = new Employee();

 // hu= em;
   //
 //ArrayList< ? extends Human> humanlist = new ArrayList<>();
  //ArrayList<Employee> emplist = new ArrayList<>();
//humanlist=emplist;
 //  ArrayList<Human> humanlist2 = new ArrayList<>();
  //humanlist=humanlist2;
//ArrayList<String> strlist = new ArrayList<>();
// humanlist=strlist;
   //


   // upper bound
   ArrayList<? extends Human> humanlist = new ArrayList<>();// this collection can only refer to only collection working with human obj or chid class of human obj so that why getting errorfor string object
   ArrayList<Employee> emplist = new ArrayList<>();//
   ArrayList<String>  sl= new ArrayList<>();
   ArrayList<Object>  o= new ArrayList<>();
   humanlist=emplist;
   ArrayList<Human> humanlist2 = new ArrayList<>();
   humanlist=humanlist2;// 
   //humanlist=sl;// error
   //humanlist=o;// error





     // Lower  bound
     ArrayList<? super Human> humanlista = new ArrayList<>();// this collection can only refer to only collection working with human obj or parent class of human obj i.e object class because human class extends object class

     ArrayList<Employee> emplista = new ArrayList<>();//
     ArrayList<String>  sla= new ArrayList<>();
     ArrayList<Object>  oa= new ArrayList<>();
    // humanlista=emplist;//error
     ArrayList<Human> humanlist2a = new ArrayList<>();
     humanlista=humanlist2;// 
     //humanlista=sl;// error
     humanlista=oa;


     //  invoking sleep method 
     Human hu= new Human(2);
     Human hu1= new Human(3);
     Employee em = new Employee(4);
    
     Employee em1 = new Employee(5);
     //hu= em;
     //ArrayList<? super Human> humanlistb = new ArrayList<>();// this collection can only refer to only collection working with human obj or parent class of human obj i.e object class because human class extends object class

     ArrayList<Employee> emplistb = new ArrayList<>();//
     emplistb.add(em);
     emplistb.add(em1);
     ArrayList<String>  slb= new ArrayList<>();
     ArrayList<Object>  ob= new ArrayList<>();
    //humanlistb=emplist;//error
     ArrayList<Human> humanlist2b = new ArrayList<>();
     humanlist2b.add(hu);
     humanlist2b.add(hu1);
     System.out.println(humanlist2b);
     for(Human h :humanlist2b)
     {
      System.out.println(h);
      h.dis();
     }
     //humanlistb=sl;// error
   // invoke(emplistb);
    invoke1(humanlist2b);
    
    }
    public static void invoke(List<? extends Human> list)
    {
      System.out.println(list);
        for(Human human :list)

        {
        //  human.sleep();
        System.out.println(human);
     human.dis();
        }
    }
   public static void invoke1(List<? super Human> list)
    {
        for(Object human :list)

      {
     //   human.sleep();
        System.out.println(human.toString());
 //System.out.println("sumanth is good boy");
 }
    }
}
class Human

{  int ko;
  public Human(int ko)
  {
    this.ko=ko;
  }
    public void sleep()
    {
        System.out.println("Humans will sleep");
    }
    public Human()
    {

    }
    public void dis()

    {
      System.out.println(ko);
    }
    public String toString()
    {
      return "suraj"+ ko;
    }
  }
class Employee extends Human

{  int ko;
  public Employee(int ko)
  {
    this.ko=ko;
  }
    public void sleep()
    {
       System.out.println("employees will sleep");
    }
    public void dis()

    {
      System.out.println(ko);
    }
    public String toString()
    {
      return "sujaj"+ ko;
    }
}
