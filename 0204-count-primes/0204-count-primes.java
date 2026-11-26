class Solution {
    public int countPrimes(int n) 
{
    if(n <= 2)
        return 0;

    boolean[] ar = new boolean[n];

    for(int i = 2; i <= Math.sqrt(n); i++)
    {
        if(!ar[i])
        {
            for(int j = i * i; j < n; j += i)
            {
                ar[j] = true;
            }
        }
    }

    int count = 0;

    for(int i = 2; i < n; i++)
    {
        if(!ar[i])
            count++;
    }

    return count;
}
}