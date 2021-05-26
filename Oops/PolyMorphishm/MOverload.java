package Oops.PolyMorphishm;

public class MOverload {

    public double areaOfCircle(double pi, double r) {

        return pi * r * r;

    }

    public double areaOfCircle(double pi, double r, double radius) {

        return pi * r * radius;

    }

    public static void main(String args[]) {

        MOverload mo = new MOverload();
        System.out.println(mo.areaOfCircle(3.14, 4));
        mo.areaOfCircle(3.14, 4);
        System.out.println(mo.areaOfCircle(3.14, 4, 3));

    }

}

/**
 * One might wonder that we could simply create new methods to perform different
 * jobs rather than overloading the same method. However, an obvious benefit is
 * that the code becomes simple and clean. We don’t have to keep track of
 * different methods.
 * It makes the code cleaner and we can re use the code again.
 * 
 * 
 */