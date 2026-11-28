class Solution {
    public int kthFactor(int n, int k) {
       List<Integer> ll=new ArrayList<>();

        int j=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
               ll.add(i);
        }

        if(ll.size()<k)
            return -1;
        else
            return ll.get(k-1);
    }
}