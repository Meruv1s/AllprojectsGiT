package pack1;

import java.util.List;
import java.util.ArrayList;

public class a {
    public static void main(String [ ] args)

    {
  List<stu> a= new ArrayList<stu>();
 
  a.add(new stu(2,3));
  a.add(new stu(2,3));
  a.add(new stu(2,3));
  a.add(new stu(2,3));

  System.out.println(a);
  for(stu s:  a  )
  {
    System.out.println(s);
  }
  List<parents> a1= new ArrayList<parents>();
 
  a1.add(new parents(2,3));
  a1.add(new parents(2,3));
  a1.add(new parents(2,3));
  a1.add(new parents(2,3));
 invok(a1);
    }
    public static void invok(List<? extends stu> kl)


    {
       System.out.println(kl);
       for (stu k :kl)

       {
        System.out.println(k);
        k.dis();

       }
    }
}
// fundmentals before io
// java file is loaded into ram and create all required statck and heap memory while executing


class stu
{
    int age1;
    int rollno;
    @Override
    public String toString() {
        return "stu [age1=" + age1 + ", rollno=" + rollno + "]";
    }
    public stu(int age1, int rollno) {
        this.age1 = age1;
        this.rollno = rollno;
    }
    public stu()

    
    
    {

    }
    public void dis()
    {
       System.out.println(this.age1 + "  sumanth") ;
    } 
}
class parents extends stu
{
    int age1;
    int adress;
    public parents(int age1, int adress) {
        this.age1 = age1;
        this.adress = adress;
    }
    @Override
    public String toString() {
        return "parents [age1=" + age1 + ", adress=" + adress + "]";
    }

}