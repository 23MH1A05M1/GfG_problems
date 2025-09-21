class Solution {
    int findFrequency(int arr[], int x) {
        // code here
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int output=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getKey()==x){
                output=entry.getValue();
                break;
            }
        }
        return output;
    }
}