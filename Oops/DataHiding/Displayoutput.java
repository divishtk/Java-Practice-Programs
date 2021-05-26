package Oops.DataHiding;

class DisplayOutput {

   

    public void display(int x, int y)
    {

        System.out.println("This is display method"+(x+y));
    }

}

class Quiz extends DisplayOutput{

    public void display(int x, int y)
    {

        System.out.println("This is display method 2"+(x+y));
    }

    


    public static void main(String[] args) {

        DisplayOutput out = new DisplayOutput();
        Quiz q=new Quiz();
        out.display(12,12);
        q.display(12,12);

       



    }
  
}