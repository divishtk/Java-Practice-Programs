package InheritanceAndSuper.TypesInheritance;

public class ineg 
{

    private int no;
    public String name;



    public void get(int no,String name)
    {
        this.no = no;
        this.name = name;

        System.out.println(no+" " +name);


    }
}

class Mmain 
{

public static void main(String[] args) {

    ineg en=new ineg();
    en.get(12, "Divisht");
  //  en.no=123;
  //  System.out.println(en.no);

}


}