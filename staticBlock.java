
class A {



    static void lol(){

        System.out.println("Static Block 2");



    }
}

public class staticBlock

{



    static int example(int a,int b)
    {


        System.out.println("Static Block");
        return a*b;

    }

    public static void main(String[] args) 
    {



        System.out.println(example(10,20));
       A.lol();










    }

}
// we can define static var inclass level only.
//cant declare static varibale in normal methods for eg
// static variables are used for memory management ebcause of this program becomes memory efficeint and saves memory 
// cant not call static method of outer class directly need to call it with classname.methodname();