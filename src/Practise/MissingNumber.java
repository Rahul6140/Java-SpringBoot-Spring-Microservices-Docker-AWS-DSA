package Practise;
/*
Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array.
To find the missing number in an array containing distinct numbers taken from 0 to n, you can utilize the concept of arithmetic progression and Gauss’s formula.
 */
public class MissingNumber {

    private static int findMissingNumber(int[] n) {
        int length = n.length;
        int expected=length*(length+1)/2;

        int actual=0;
        for(int num : n){
            actual += num;
        }
        return expected-actual;
    }

    public static void main(String[] args){
        int[] n = {0,1,2,3,6,4,7,8,9,10};
        int missingNumber = findMissingNumber(n);
        System.out.println("Missing number is : "+missingNumber);
    }

    /*
    This program defines a method findMissingNumber that takes an array of distinct numbers as input.
    It calculates the expected sum of numbers from 0 to n using the formula n * (n + 1) / 2, where n is the length of the array.
    Then, it calculates the actual sum of numbers in the array. Finally,
    it returns the difference between the expected sum and the actual sum, which represents the missing number.
     */

}
