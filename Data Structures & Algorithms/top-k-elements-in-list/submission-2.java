class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        ArrayList<Integer>[] list = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int key : map.keySet()) {
            list[map.get(key)].add(key);
        }
        int[] ans = new int[k];
        int index = 0;
        for (int i = n; i >= 0; i--) {
            for(int j=0;j<list[i].size();j++){
                if(k == 0){
                    break;
                }
                ans[index++] = list[i].get(j);
                k--;
            }
            if(k == 0) break;
        }
        return ans;
    }
}
