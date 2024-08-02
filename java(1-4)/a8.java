public class a8 {
    public static void main(String []args){
     vari obj = new vari(2,3);
     vari obj1= new vari(3,4);
     System.out.println(obj.byke + ""+ obj.tyre);
     System.out.println(obj1.byke + ""+ obj1.tyre);
     System.out.println(obj1);
    }

}
class vari
{
    int tyre;
    int byke;
    public vari(int a,int b)
    {

    tyre=a;
      byke=b;
    }
   public String toString()

   {
  return "sumanth"+ tyre;
   }
   
}

// assigning the values to an object  thriugh constructer