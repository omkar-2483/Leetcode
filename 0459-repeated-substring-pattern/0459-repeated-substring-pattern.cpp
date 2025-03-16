class Solution {
public:
    bool repeatedSubstringPattern(string s) {
        string temp = s+s;
        temp = temp.substr(1, temp.length()-2); //remove first and last character
        return temp.find(s) != -1;
    }
};