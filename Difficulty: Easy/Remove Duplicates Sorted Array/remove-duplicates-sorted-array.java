class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
         Set<Integer> set = new HashSet<>();
         ArrayList<Integer> res = new ArrayList<>();
         for(int i=0;i<arr.length;i++)
         {
             set.add(arr[i]);
         }
         for(int i:set)
         {
             res.add(i);
         }
         Collections.sort(res);
        return res; 
    }
}
