public class dog  {
    


    private String name;
    private float height;


    public void setName(String name)
    {

        this.name = name;
    }


    public String getName()
    {

        return name;
        
        
    }


    /*
    iterface
    publci void setNmae();
    */




    public void setHeight(float height)
    {

                if(height>12.f)
                {

                    this.height = height;

                }
                else
                {

                    this.height =12.f;

                }

    }


    public float getHeight()
    {

        return height;

    }


}


class realEncape
{


    public static void main(String args[])

    {

        dog dog = new dog();
        dog.setName("Tommy");
        dog.setHeight(13.f);
        System.out.println(dog.getName());
        System.out.println(dog.getHeight());




    }



}