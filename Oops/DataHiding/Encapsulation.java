package Oops.DataHiding;

public class Encapsulation {
 
    
   private int value;


   public void setValue(int value) {

    this.value=value;

   }

   public int getValue() {

        return value;

   }


}


class Menu{

    public static void main(String args[])
{


    Encapsulation e=new Encapsulation();
    e.setValue(1022);
    System.out.println(e.getValue());
}
}