import java.util.Arrays;

public class InsertionSort {

    static void insertionSortMethod(int[] nums, int size){
        int j;
        int temp;

        System.out.println("Unsorted Array : "+ Arrays.toString(nums));

        for(int i=1;i<size;i++){
            temp=nums[i];
            j=i-1;
            while(j>=0 && nums[j]>temp){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=temp;
            System.out.println("Steps" +i+ " : "+ Arrays.toString(nums));
        }
        System.out.println("Sorted Array : "+ Arrays.toString(nums));
    }

    public static void main(String[] arg){
        int[] nums = {7,6,5,4,3,2,1,0};
        int size = nums.length;
        insertionSortMethod(nums,size);

    }
}
