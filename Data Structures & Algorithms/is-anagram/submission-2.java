class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[256];
        Arrays.fill(count,0);
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - '0']++;
        }

        for(int i=0;i<t.length();i++){
            count[t.charAt(i) - '0']--;
        }

        for(int i=0;i<256;i++){
            if(count[i] != 0) return false;
        }
        return true;
    }

}
