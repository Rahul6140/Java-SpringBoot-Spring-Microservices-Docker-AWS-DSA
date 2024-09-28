package Practise;

import java.util.Scanner;

/* Pyramid Pattern 4 code

                     1
                   1 2 1
                 1 2 3 2 1
               1 2 3 4 3 2 1
             1 2 3 4 5 4 3 2 1
           1 2 3 4 5 6 5 4 3 2 1
         1 2 3 4 5 6 7 6 5 4 3 2 1
       1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
     1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

 */
public class PyramidPattern4 {

    public static void pyramid(int num){

        for(int i=1; i<=num; i++){
            //space
            for(int j=i; j<=num; j++){
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }

            for(int l=i-1; l>=1; l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pyramid height : ");
        int num = sc.nextInt();
        sc.close();
        pyramid(num);
    }

}
