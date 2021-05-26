package Oops.Constructor;

class Date {
    int day;
    int month;
    int year;

    public Date() {
        // We must define the default values for day, month, and year
        day = 0;
        month = 0;
        year = 0;
    }

    // A simple print function
    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

}

class Demo {

    public static void main(String args[]) {
        // Call the Date constructor to create its object;
        Date date = new Date(); // Object created with default values!
        date.printDate();
    }

}

/**
 * The default constructor does not need to be explicitly defined. Even if we
 * don’t create it, the JVM will call a default constructor and set data members
 * to null or 0. If you don’t define any constructor, the Java compiler will
 * insert a default constructor for you. Thus, once the class is compiled it
 * will always at least have a no-argument constructor.
 */






 /*  Paramterized Constructor

 In a parameterized constructor, we pass arguments to the constructor and set them as the values of our data members.

 We are basically overloading the default constructor to accommodate our preferred values for the data members.
    public Date() {
    // We must define the default values for day, month, and year
    day = 0;
    month = 0;
    year = 0;
  }

  // Parameterized constructor
  public Date(int d, int m, int y){
    // The arguments are used as values
    day = d;
    month = m;
    year = y;
  }

  // A simple print function
  public void printDate(){ 
    System.out.println("Date: " + day + "/" + month + "/" + year);
  }
}

class Demo {
  
  public static void main(String args[]) {
    // Call the Date constructor to create its object;
    Date date = new Date(1, 8, 2018); // Object created with specified values! // Object created with default values!
    date.printDate();
  }
  

  */