package Practise;

/* Pyramid Pattern 3 code

                    9
                  8 9 8
                7 8 9 8 7
              6 7 8 9 8 7 6
            5 6 7 8 9 8 7 6 5
          4 5 6 7 8 9 8 7 6 5 4
        3 4 5 6 7 8 9 8 7 6 5 4 3
      2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
    1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

 */

import java.util.Scanner;

public class PyramidPattern6 {

    public static void pyramid(int num){
        for(int i=num; i>=1; i--){
            //space
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int k=i; k<=num; k++){
                System.out.print(k+" ");
            }
            for(int l=num-1; l>=i; l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of pyramid : ");
        int num = sc.nextInt();
        sc.close();
        pyramid(num);
    }

}
