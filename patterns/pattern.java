package patterns;

import java.util.Scanner;

public class pattern {
  

    


  
    public static void main(String[] args)
    {



          /*
      

        5
*
**
***
****
*****

     
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input n");
        int n=sc.nextInt();


        for(int row=1;row<=n;row++){


            for(int stars=1;stars<=row;stars++)
            {

                System.out.print("*");

            }
            System.out.println();



        } */




/*


    *
   **
  ***
 ****
*****



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input n");
        int n=sc.nextInt();

        for(int row=1;row<=n;row++){

            for(int space=n;space>row;space--){

                System.out.print(" ");


            }

            for(int stars=1;stars<=row;stars++)
            {

                System.out.print("*");

            }
            System.out.println();

            
        }*/




   /*    *
        ***
       *****


        



        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input n");
        int n=sc.nextInt();



            for(int rows=1;rows<=n;rows++)
            {

                int nrows=2*rows-1;
                int nspace=n-rows;


                for(int space=1;space<=nspace;space++)

                {

                    System.out.print(" ");

                }

                for(int star=1;star<=nrows;star++)

                {

                    System.out.print("*");




                }

                System.out.println();

                



            }
*/




    } 

}
