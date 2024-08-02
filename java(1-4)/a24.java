public class a24 {
    
    public static void main(String []args)
    {
        laptop lap =laptop.surface;
        System.out.println(lap +""+lap.getPrice());
  
        for (laptop la : laptop.values() )
        {
            System.out.println(la + "   "+la.getPrice());
        }
    }
}
enum laptop
{
    mackbook(200) ,xps(23),surface(45),sum;
   private int price;
   
   
   public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}

  private laptop()
  {
      this.price=500;
      System.out.println("sbckjsc");
  }
    private laptop(int price) {
        this.price = price;
        System.out.println("in lap" + this.name());
    }

}