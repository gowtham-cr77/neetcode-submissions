class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int ele:nums){
            ans.put(ele,ans.getOrDefault((ele),0)+1);
        }
        for(int val:ans.values()){
            if(val>1){
                return true;
            }
        }
        return false;
    }
}