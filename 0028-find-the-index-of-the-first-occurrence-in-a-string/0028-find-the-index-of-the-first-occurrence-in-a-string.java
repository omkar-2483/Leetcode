class Solution {
    public int strStr(String haystack, String needle) {
        int nl=needle.length();
        int hl=haystack.length();
        for(int i=0; i< hl-nl+1; i++){
            if((haystack.substring(i,i+nl)).equals(needle)) return i;
        }
        return -1;
    }
}