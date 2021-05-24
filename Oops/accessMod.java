package Oops;

public class accessMod {

    private int gun;
    private String name="Hello";

    private int getGun() {

        return gun;

    }


    public String getName()
    {

        return name;

    }
    public static void main(String args[]) 
    
    {

        accessMod am= new accessMod();
        am.getGun();
        System.out.println(am.getName());
        System.out.println(am.gun=12);
        System.out.println(am.name);
        /**
         * We can access the private DM or methods  within the class 
         * 
         */
    }
}
