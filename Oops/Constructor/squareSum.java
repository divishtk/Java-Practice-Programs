package Oops.Constructor;
public class squareSum {
 

   
    

    
    public double squareSums(double no1,double no2,double no3)
    {

        double sum=0;

        sum=no1+no2+no3;


        return sum;
    }

   

    public static void main(String aString[])
    {
        squareSum s= new squareSum();
        s.squareSums(2*2, 3*3, 4*4);


    }


}
