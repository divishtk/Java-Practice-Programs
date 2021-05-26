package Oops.Constructor;

public class constExe {

    String model;
    String carname;
    String seats;

    public constExe(String model,String carname)
    {

        this.model=model;   
        this.carname=carname;
        


    }

    public constExe(String modell,String namee,String seats)
    {
            this(modell,namee);
            this.seats=seats;
    }

        public String getcarData()
        {

            return model+" " +carname +" "+seats;
        }

    public static void main(String args[]) {

        constExe ce=new constExe("A310","Lamborghini","2");
        System.out.println(ce.getcarData()) ;


    }
}
