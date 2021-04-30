public class staticEg {
 
    

    int a=20;       //instance variable (Global variable)
    static int b=90;
    int c=900;
    int ss=20;



    void numbers() {


        System.out.println("This is instance variable"+a);
        System.out.println("This is static variable"+b);



    }

    static int no(int a ,int b) 
    {


        return a+b;
    }






    static
    {

        System.out.println("This is Static Block");

    }

    public static void main(String[] args)
    {

        staticEg s=new staticEg();
        System.out.println("Hello");
        s.numbers();
        System.out.println("Addition is"+staticEg.no(20, 30));
        System.out.println("This is instance variable"+s);

    }
}


// we can define static var inclass level only.
//cant declare static varibale in normal methods for eg
// static variables are used for memory management ebcause of this program becomes memory efficeint and saves memory 

/**for eg
 * 
 *  void eg() {
 *  
 * static int a=10; // throw errors
 * }
 */