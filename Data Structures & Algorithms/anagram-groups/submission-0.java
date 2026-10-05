class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int n = strs.length;
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String word = strs[i];
            char[] duplicate = word.toCharArray();
            Arrays.sort(duplicate);
            String sorted = new String(duplicate);

            map.computeIfAbsent(sorted,k -> new ArrayList<>()).add(word);
        }
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }

        return ans;
    }
}
