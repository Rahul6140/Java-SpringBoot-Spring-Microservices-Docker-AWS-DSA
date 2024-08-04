package DSA;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSortMethod(int[] nums, int size){
        int temp;
        System.out.print("Unsorted Array : "+ Arrays.toString(nums));
        System.out.println();
        for(int i=0; i<size; i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.println("Step "+(i+1)+" : "+ Arrays.toString(nums));
        }
        System.out.print("Sorted Array : "+ Arrays.toString(nums));
    }

    public static void main(String[] arg){
        int[] nums = {2,5,6,8,1,0};
        int size = nums.length;
        bubbleSortMethod(nums, size);
    }

}
