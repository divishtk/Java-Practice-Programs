package Inheritance;

public class superkey {
    

    int value=101;


}




class normal extends superkey
{


    int value=102;

    public void value()
    {


        System.out.println("Value is "+value);
        System.out.println("Value of parent class is "+super.value);



    }

}

class Mains
{

    public static void main(String args[]){


            normal normal=new normal();
            normal.value();
           


    }

}