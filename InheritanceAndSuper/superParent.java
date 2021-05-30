package Inheritance;

public class superParent {

    public void parent() {

        System.out.println("This is parent method");

    }

}

class Childs extends superParent {

    public void parent() {

        System.out.print("This ic child  with same method name \n");

    }

    public void finalCall() {

        parent();
        super.parent();

    }

}

class Mainss {
    public static void main(String[] args) {

        Childs c = new Childs();
        c.finalCall();

    }
}

/*
 * 
 * 
 * 
 * Calling a Parent Class Method # Just like the fields, super is also used with
 * the methods. Whenever a SuperClass and the immediate SubClass have any
 * methods with the same name we use super to access the methods from the
 * SuperClass inside the SubClass. Let’s go through an example:
 */