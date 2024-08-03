package DSA;

import java.util.Arrays;

public class BinarySearch {

    static int getIntegerIndex(int[] nums, int target){
        Arrays.sort(nums);
        System.out.println("Sorted Arrays : "+Arrays.toString(nums));
        System.out.println("Target : "+target);
        int s = 0;
        int e = nums.length;
        int m;

        while(s<e){
            m = (s+e)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]<target){
                s = m+1;
            }
            else if(nums[m]>target){
                e = m-1;
            }
        }
        return -1;
    }

    public static void main(String[] arg){
        int[] nums = {9,4,2,3,1,8,6};
        int target = 9;
        int result = getIntegerIndex(nums, target);
        if(result!=-1){
            System.out.println("Integer is found at index : "+result);
        }else{
            System.out.println("Integer is not present in array");
        }
    }
}
