public class a7 {
    public static void main(String [] args)
    {
        new cons();
        new cons();
    }
}
class cons
{
    int x=1;
    static int y=1;
    public cons()
    {
x++;
y++;
 System.out.println(x);
 System.out.println(y);
    }
}

// checkinhg how a static variable works