public class initBlock {

    static {

        System.out.println("Static 1");
    }

    {

        System.out.println("Init 1");
    }
    {

        System.out.println("Init 2");
    }

    public static void main(String[] args) {

        initBlock b1 = new initBlock();
        initBlock b2 = new initBlock();

    }

    static {
        System.out.println("Static 3");

    }

    static {
        System.out.println("Static 2");

    }
    {

        System.out.println("Init 3");

    }

}
