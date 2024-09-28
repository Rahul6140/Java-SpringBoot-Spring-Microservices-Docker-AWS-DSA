package Practise;

import java.util.Scanner;

/* Pyramid Pattern 2 code

            1
           1 2
          1 2 3
         1 2 3 4
        1 2 3 4 5
       1 2 3 4 5 6
      1 2 3 4 5 6 7
     1 2 3 4 5 6 7 8
    1 2 3 4 5 6 7 8 9

*/
public class PyramidPattern2 {

    public static void pyramid(int num){

        for(int i=1; i<=num; i++){
            //space
            for(int j=i; j<=num; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
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
