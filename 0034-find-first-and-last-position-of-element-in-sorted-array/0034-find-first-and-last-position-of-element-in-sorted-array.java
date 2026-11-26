class Solution {
    public int[] searchRange(int[] ar, int target) {
        int[] ans={-1,-1};
        ans[0]=search(ar,target,true);
        if(ans[0]!=-1)
            ans[1]=search(ar,target,false);
        return ans;

    }

    public static int search(int[] ar,int target,boolean findStartIndex)
    {
        int ans=-1;
        int start=0;
        int end=ar.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<ar[mid])
                end=mid-1;
            else if(target>ar[mid])
                start=mid+1;
            else
            {
                ans=mid;
                if(findStartIndex)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return ans;
    }
}