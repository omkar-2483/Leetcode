class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        // HashMap<Character, Integer> hm = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     char c = s.charAt(i);
        //     if(hm.containsKey(c)){
        //         hm.put(c, hm.get(c)+1);
        //     }else{
        //         hm.put(c,1);
        //     }
        // }

        // for(int i=0; i<t.length(); i++){
        //     char c = t.charAt(i);
        //     if(hm.containsKey(c)){
        //         hm.put(c, hm.get(c)-1);
        //         if(hm.get(c)<1) hm.remove(c);
        //     }else{
        //         return false;
        //     }
        // }
        // return true;

        if(s.length() != t.length())
            return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        s = new String(sArray);
        t = new String(tArray);
        return (s.equals(t));
    }
}