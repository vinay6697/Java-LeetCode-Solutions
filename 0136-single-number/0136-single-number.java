class Solution {
    public int singleNumber(int[] ar) {
        HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int i=0;i<ar.length;i++)
		{
			hm.put(ar[i], hm.getOrDefault(ar[i], 0)+1);
		}
		int ele=0;
		Set<Integer> set=hm.keySet();
		for(int i:set)
		{
			if(hm.get(i)==1)
				ele=i;
		}
        return ele;
    }
}