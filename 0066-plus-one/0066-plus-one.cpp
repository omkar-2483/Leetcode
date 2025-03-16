class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int carry = 1;
        int n=digits.size();
        for(int i = n-1; i>=0; i--){
            int sum = (digits[i]+carry)%10;
            carry = (digits[i]+carry) / 10;
            digits[i] = sum;
        }
        if(carry == 0) return digits;
        digits.insert(digits.begin(), carry);
        return digits;
    }
};