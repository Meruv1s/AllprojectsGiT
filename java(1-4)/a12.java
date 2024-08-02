public class a12 {
    public static void main (String []args)
    {
  
    st a =new st();
     a.race=3;
     a.car ="cne";
     st a1 = new st();
     a1.race =6;
     a1.car="jdcb";

   System.out.println(a);
   boolean x=a.equals(a1);
   System.out.println(x);

    }
}
class st 
{ int  race=2;
    String car ="diki";
    
    public String toString()
    {
    return race + car;
    
    }
    public boolean equals(st that)
    {
        if ( this.car.equals(that.car) && this.race == that.race)
        {
            return true;

        }
        else 
        {
             return false;
        }
    }
     
 
}// it will run tostring method when we print an object


// every java file by default imports java. lang file 
// and every class in java extends obj class which is their in java. lang file
