class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int n = nums.length;
        // int count = 0;
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(nums[i] == nums[j] && i<j){
        //             count++;
        //         }
        //     }
        // }
        // return count;  

         Map<Integer, Integer> map = new HashMap<>();

         int goodPairs = 0;

        for (int i = 0; i<nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                 map.put(nums[i], 1);
             } 
             else{
                   goodPairs = goodPairs + map.get(nums[i]);
                   map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        return goodPairs;
    } 
}
