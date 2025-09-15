// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        int count=1;
        // code here
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                count++;
            }
        }
        return count;
    }
}