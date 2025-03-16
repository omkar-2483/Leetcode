class Solution {
public:
    // char findTheDifference(string s, string t) {
    //     sort(s.begin(), s.end());
    //     sort(t.begin(), t.end());
    //     for(int i=0; i<s.length(); i++){
    //         if(s[i] != t[i]){
    //             return t[i];
    //         }
    //     }
    //     return t[t.length()-1];
    // }

    //using xor
    char findTheDifference(string s, string t) {
        // a ^ a =0
        // a ^ 0 = a

        char ans = s[0];
        for(int i=1; i<s.length(); i++){
            ans = ans ^ s[i];
        }
        for(char c : t){
            ans = ans ^ c;
        }
        return ans;
    }
};