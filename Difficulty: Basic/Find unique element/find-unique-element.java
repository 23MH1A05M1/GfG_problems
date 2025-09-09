class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int f[] = new int[max+1];
        int res=0;
        for(int num:arr)
        {
            f[num]++;
        }
        for(int i=0;i<f.length;i++)
        {
            if(f[i]==1)
            {
                res=i;
            }
        }
        return res;
    }
}