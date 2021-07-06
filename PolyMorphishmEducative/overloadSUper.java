package PolyMorphishmEducative;

class Demo {

    String name;

    Demo() {

        name = "Divisht";

    }

    public String getName() {

        return name;

    }

}

class lastName extends Demo {

    String lastName;

    lastName(String lastName) {

        this.lastName = lastName;

    }

    // overridden method

    public String getName() {

        return super.getName() + " ," + this.lastName;

    }

}

class overloadSUper {

    public static void main(String args[]) {

        lastName l = new lastName("kori");
        System.out.println(l.getName());

    }

}