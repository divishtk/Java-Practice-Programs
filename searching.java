import java.util.*;

public class searching {

    public static void main(String args[]) {

        int size;

        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the elements");

        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }

        System.out.println("Elements You have Entered is");
        for (int j = 0; j < size; j++) {

            System.out.println(" " + array[j]);

        }

        System.out.println("Which elements do you wanna find out?");
        int ele = sc.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {

            if (ele == array[i]) {

                count += 1;

                if (count > 0) {
                    System.out.println("Element found " + array[i] + " at position " + i);

                    
                }
            } 

           

        }

        if(count<=0)
        {
            
            
            System.out.println("No element found");
        }

    }
}
