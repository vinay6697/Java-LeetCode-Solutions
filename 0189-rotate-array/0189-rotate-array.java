class Solution {
    public  void rotate(int[] ar, int k) {
	       k=k%ar.length;
	       int[] temp=new int[k];

	       for(int i=ar.length-k;i<ar.length;i++)
	            temp[i-(ar.length-k)]=ar[i];
	       
	       for(int i=ar.length-1;i>=k;i--)
	    	   ar[i]=ar[i-k];	       
	       
	       for(int i=0;i<k;i++)
	    	   ar[i]=temp[i];
	    }
}