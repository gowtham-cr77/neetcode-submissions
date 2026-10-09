class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            map.put(ele , map.getOrDefault(ele , 0) + 1);
        }
        int longest = 1;
        for(int ele:nums){
            if(map.containsKey(ele - 1)){
                continue;
            }else{
                int max = 1;
                while(map.containsKey(ele+1)){
                    max++;
                    longest = Math.max(longest,max);
                    ele = ele + 1;
                }
            }
        }
        return longest;
    }
}
