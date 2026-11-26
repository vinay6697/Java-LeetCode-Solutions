class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else
                i++;
        }
        int ele=-1;
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index+1)
                ele=nums[index];
        }
        return ele;
        
    }

    public static void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}