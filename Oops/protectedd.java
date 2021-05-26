package Oops;

public class protectedd {

    String name = "Divisht K";

    protected void getName() {

        System.out.println("Name is " + name);

    }

}
/**
 * 
 * Default #
If we do not mention any access modifier, then it is considered to be default access. The default access is similar to the protected. It also has package-level access, but it also applies to inherited classes as well, unlike protected. So, you can say that its access is more limited.
 */