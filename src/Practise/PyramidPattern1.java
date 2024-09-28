package Practise;

import java.util.Scanner;

/* Pyramid Pattern 1 code

            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5
       6 6 6 6 6 6
      7 7 7 7 7 7 7
     8 8 8 8 8 8 8 8
    9 9 9 9 9 9 9 9 9

*/
public class PyramidPattern1 {

    public static void pyramid(int num){
        for(int i=1; i<=num; i++){
            //space
            for(int j=i; j<=num; j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid : ");
        int num = sc.nextInt();
        sc.close();
        pyramid(num);
    }
}
