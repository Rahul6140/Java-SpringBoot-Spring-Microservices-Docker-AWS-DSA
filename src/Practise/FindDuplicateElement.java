package Practise;
/*
Write a Java program to find all duplicate elements in an array.
To detect duplicate elements in an array in Java,
you can use various approaches such as using a HashSet,
sorting the array, or using nested loops.
 */

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {

    public static void findDuplicate(int[] nums){
        if(hasDuplicate(nums)){
            System.out.println("Duplicates are present in provided input.");
        }else{
            System.out.println("No Duplicates are there in provided input.");
        }
    }

    public static boolean hasDuplicate(int[] nums){
        Set<Integer> s = new HashSet<>();
        
        for(int n : nums){
            if (!s.add(n)){
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,3,4,5,2,6,7,8,3,9,10};
        findDuplicate(nums);
    }
}
