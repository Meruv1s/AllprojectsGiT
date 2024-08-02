public class a22 {
    public static void main(String []args)

    {
int num=6;
Integer num1=num;//autoboxing // new Integer(5); boxing
System.out.println(num1);
int num2=num1;//auto unboxing//num1.intValue();//unboxing
System.out.println(num2);
String str= new String("12");
int num3=Integer.parseInt(str);
System.out.println(num3*2);
    }
}
// wrapper classes
//Integer clas ,Character class , .. all this classes extends object class