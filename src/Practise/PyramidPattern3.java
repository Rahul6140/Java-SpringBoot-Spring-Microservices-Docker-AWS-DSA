package Practise;

import java.util.Scanner;

/* Pyramid Pattern 3 code

            *
           * *
          * * *
         * * * *
        * * * * *
       * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *

*/
public class PyramidPattern3 {

    public static void pyramid(int num){
        for(int i=1; i<=num; i++){
            //space
            for(int j=i; j<=num; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of Pyramid : ");
        int num = sc.nextInt();
        sc.close();
        pyramid(num);
    }
}
