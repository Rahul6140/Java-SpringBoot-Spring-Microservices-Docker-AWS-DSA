package Practise;

/* Pyramid Pattern 3 code

     1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
       1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
         1 2 3 4 5 6 7 6 5 4 3 2 1
           1 2 3 4 5 6 5 4 3 2 1
             1 2 3 4 5 4 3 2 1
               1 2 3 4 3 2 1
                 1 2 3 2 1
                   1 2 1
                     1

 */

import java.util.Scanner;

public class PyramidPattern5 {

    public static void pyramid(int n){
        for(int i=n; i>=1; i--){
            //space
            for(int j=i; j<=n; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Pyramid : ");
        int n = sc.nextInt();
        sc.close();
        pyramid(n);
    }
}
