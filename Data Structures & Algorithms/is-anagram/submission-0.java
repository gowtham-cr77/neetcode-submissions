class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        char[] ssorted = s.toCharArray();
        char[] tsorted = t.toCharArray();

        Arrays.sort(ssorted);
        Arrays.sort(tsorted);

        int i=0;
        int j=0;

        while(i<ssorted.length){
            if(ssorted[i] != tsorted[j]) return false;
            i++;
            j++;
        }
        return true;
    }
}
