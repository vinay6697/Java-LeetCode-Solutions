class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ll=new ArrayList<>();

        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else 
            i++;
        }

        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index+1)
                ll.add(index+1);
        }
        return ll;
    }

    public static void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}