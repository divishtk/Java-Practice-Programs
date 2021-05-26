package Oops;

public class getterSetter {

    private double pi;
    private int radius;

    public void setPi(double pi) {
        this.pi = pi;

    }

    public double getPi() {

        return pi;

    }

    public void setRadius(int radius) {
        this.radius = radius;

    }

    public int getRad() {

        return radius;

    }


    public double getAreaOfCircle()
    {

        return pi*radius*radius;
    }

    
    public static void main(String args[])  {
        

         getterSetter gs= new getterSetter();
 
         gs.setPi(3.14);
         gs.setRadius(5);
         System.out.println(gs.getPi());
         System.out.println( gs.getRad());
         System.out.println(gs.getAreaOfCircle());
       
 
 
 
     }
    
}


