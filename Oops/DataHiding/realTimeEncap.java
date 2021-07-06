package Oops.DataHiding;

/*class Dog {

    String name;
    float height;

}

public class realTimeEncap {
 
    public static void main(String args[])

    {

        Dog r = new Dog();
        r.name = "Tommy";
        r.height = 1.8f;
        System.out.println("Name is " + r.name + "Height is " + r.height + "inches");

        /*
         * If the height is changed from 20f to 0f as like:
         * 
         * OP will be name is tommy and height is 0f
         * 
         * 
         * But did you ever heard dog having height of 0.0 inches? Here,the instance
         * attributes height is accessible from outside so small changes in value may
         * causes the unwanted change in result.
         * 
         * So the concept of Encapsulation helps to hide data from outside. It provides
         * the security. Even if the instance variables is changed from outside, it
         * first checks the condition and then process further like as:
         * 
         * 
         * But if we define private to instance variables then....
         




    }

}*/

class Dog {

    private String name;
    private float height;

    public void setname(String name) {

        this.name = name;

    }

    public String getName() {

        return name;
    }

    public void setHeight(float height) {

        if (height > 6.6f) {

            this.height = height;

        } else

        {

            // System.out.println("Height should be gretaer ");

           this.height = 6.6f;
        }

    }

    public float getHeight() {

        return height;
    }

}

public class realTimeEncap {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.setHeight(4.44f);
        d.setname("Tommy");
        float f=d.getHeight();
        System.out.println("Name is " + d.getName());
        System.out.println("Height is " + f);

    }

}