public class staticEmp {

    String name;
    float salary;
    String Dept;
    String address;
    static String comp="Infosys";
 

    public String showDetails(String na,float sal,String deptt,String add,String Company)
     {

        name = na;
        salary = sal;
        Dept = deptt;
        address=add;
      // System.out.println(name +" "+salary+ " "+Dept+ " "+address+" "+comp);


       return name +" "+salary+ " "+Dept+ " "+address+" "+comp;
        
    }

    public static void main(String[] args) 
    {

        staticEmp se= new staticEmp();
        System.out.println("User Information");
       // se.showDetails("Divisht",20000,"IT","Mumbai",staticEmp.comp);
      //  se.showDetails("Meet Gada",20000,"IT","Mumbai",staticEmp.comp);
        //se.showDetails("Abhishek",20000,"IT","Mumbai",staticEmp.comp);
        System.out.println(se.showDetails("Divisht",20000,"IT","Mumbai",staticEmp.comp));
        

        




    }
}
