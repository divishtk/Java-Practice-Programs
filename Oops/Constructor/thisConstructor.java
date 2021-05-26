package Oops.Constructor;

public class thisConstructor {
    

    int x;
    int y;
    int z;
    private String birthday;

    public thisConstructor(int x ,int y ,int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public thisConstructor(int x ,String birthday,int y ,int z)
    {
        this( x, y, z); // calling default constructor
        this.birthday = birthday;






    }

    public void bestWishes()
    {


        System.out.println("Today is my Birthday" +x+" "+birthday+" "+y+" "+z);

    }


    public static void main(String args[])
    {

        thisConstructor tc= new thisConstructor(5,"April",1997,2021);
        tc.bestWishes();



    }
}
