import java.util.Scanner;

public class BubbleSort 
{


    public static void main(String args[])
     {
         

        System.out.println("----Bubble Sort------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the elements");

        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();


        }
        System.out.println("Elements entered are ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);

            
        }



        int count=1;
        int temp=0;
        while (count<size)
        {

            for (int i = 0; i < size-count; i++) {
                if(array[i]>array[i+1])
                {

                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;

                }
             //   count++;




            }

            count++;





        }
        System.out.println("Elements sorted via bubble sort is ");
        for (int i = 0; i < array.length; i++) 
        {

            System.out.print(" " +array[i]);

            
        }




    }

}