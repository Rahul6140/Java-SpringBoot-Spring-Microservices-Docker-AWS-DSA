package DSA;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSortMethod(int[] nums, int size){
        int temp;
        int minIndex;
        System.out.print("Unsorted Array : "+ Arrays.toString(nums));
        System.out.println();
        for(int i=0; i<size-1; i++){
            minIndex=i;
            for(int j=i+1;j<size;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
            System.out.println("Step "+(i+1)+" : "+ Arrays.toString(nums));
        }
        System.out.print("Sorted Array : "+ Arrays.toString(nums));
    }

    public static void main(String[] arg){
        int[] nums = {6,5,4,3,2,1,0};
        int size = nums.length;
        selectionSortMethod(nums,size);
    }
}
