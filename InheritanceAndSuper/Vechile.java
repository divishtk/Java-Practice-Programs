package Inheritance;
public class Vechile
{


    private String name;
    private int modelNo;
    private int noOfseats;
    private String type;




    public Vechile(String name, int modelNo, int noOfseats, String type)
    {

        this.name = name;
        this.modelNo = modelNo;
        this.noOfseats = noOfseats;
        this.type = type;



    }


        public void showDetailsCars()
        {

            System.out.println("Car name is "+name);
            System.out.println("Model no is "+modelNo);
            System.out.println("no of seats is "+noOfseats);
            System.out.println("Type is "+type);



        }


}


class Car extends Vechile
{

    private int price;

    public Car(String name, int modelNo, int noOfseats, String type,int price) {
        super(name, modelNo , noOfseats, type);//called parent constructor
        this.price = price;



    }


    public void finalCall()
    {
        showDetailsCars();
        System.out.println("Price is "+price);

    }

    



}

class Main {


    public static void main(String args[]){


        Car carname=new Car("Tesla",109,4,"Four Wheeler",300000);
        carname.finalCall();

    }

}


