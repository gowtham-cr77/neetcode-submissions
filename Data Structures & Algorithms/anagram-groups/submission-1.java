class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String word:strs){
            int[] count = new int[26];
            for(int i=0;i<word.length();i++){
                count[word.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(word);
        }
        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
