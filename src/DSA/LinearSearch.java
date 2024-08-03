package DSA;

public class LinearSearch {

    static int getIntegerIndex(int[] nums, int target){

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] arg){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int result = getIntegerIndex(nums, target);
        if(result!=-1)
        {
            System.out.println("Integer is at index : "+result);
        }
        else {
            System.out.println("Integer is not present in array");
        }
    }
}
