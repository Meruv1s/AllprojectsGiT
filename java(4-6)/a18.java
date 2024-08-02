
public class a18 {
    public static void main(String [] args)


    {
Student1<Integer> st = new Student1<>(10);
st.disp();
System.out.println(st.getobj());
 
Student1<String> st1 = new Student1<>("su12manth");
st1.disp();
System.out.println(st1.getobj());
System.out.println(st);
    }
}

 class Student1<T>
 {
 T obj1;
   public Student1(T obj)

   {
    this.obj1=obj;
   }
   public void disp()

   { 
    System.out.println("type of data passed here"+obj1.getClass().getName());
   }
   public T getobj()

   {
   System.out.println(obj1.toString()); 
    return obj1;
   } 
   public String toString()
   {
    return obj1+"sumanth";
   }

 }
 // creating generics to own class