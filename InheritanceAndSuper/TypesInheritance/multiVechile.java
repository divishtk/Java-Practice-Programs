package InheritanceAndSuper.TypesInheritance;

public class multiVechile {
  
    private int topSpeed;

    public void setTopSpeed(int speed) {
      this.topSpeed=speed;
      System.out.println("The top speed is set to: "+ topSpeed);
    }
}


class Car extends multiVechile { // Derived from Vehicle Base for Prius

    public void openTrunk() {
      System.out.println("The Car trunk is Open Now!"); 
    } 
  
  } 


  class Prius extends Car {// Derived from Prius & can be base to any further class

    public void turnOnHybrid() {
      System.out.println("The Hybrid mode is turned on!"); 
    } 
  
  } 

  class Mainnnn {

    public static void main(String[] args) {
      Prius priusPrime = new Prius(); 
      priusPrime.setTopSpeed(220);
      priusPrime.openTrunk();
      priusPrime.turnOnHybrid();
    }
  
  }
