
//ENCAPSULATION
public class e {
   

    private String name;
    public String surname;

    /*To achieve encapsulation

    1)Declare access modifiers(PRIVATE) to instance variables(Global Variables)
    2)Declare getter and Settesr(Public).


    */
    

    public void setName(String name){

        this.name = name;

    }

    public String getName(){



        return name;




    }


    public void setSurname(String surname){

        this.surname = surname;

    }

    public String getsurname(){



        return surname;




    }





}

class Main{





    public static void main(String[] args)
    {
        e e=new e();
        e.setName("Divisht");
        System.out.println(e.getName());





    }

}
