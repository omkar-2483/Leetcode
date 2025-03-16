class Solution {
public:
    string toLowerCase(string s) {
        int n=s.length();
        for(int i=0; i<n; i++){
            int cur =(int) s[i];
            if(cur>=65 && cur <=90){
                cur+=32;
                s[i] = (char) cur;
            }
        }
        return s;
    }
};