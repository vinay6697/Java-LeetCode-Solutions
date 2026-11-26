class Solution {
    public void moveZeroes(int[] nums) {
         int[] ar=new int[nums.length];

        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                ar[j++]=nums[i];
            }
        }
        
        for(int i=0;i<ar.length;i++)
            nums[i]=ar[i];
    }
}