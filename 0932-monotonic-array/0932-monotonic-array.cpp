class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        int n = nums.size();
        if (n <= 2)
            return true;

        int i = 0;
        while (i + 1 < n && nums[i] == nums[i + 1]) i++;
        if (i + 1 < n && nums[i + 1] > nums[i]) {
            while (i + 1 < n) {
                if (nums[i + 1] < nums[i]) return false;
                i++;
            }
        } else {
            while (i + 1 < n) {
                if (nums[i + 1] > nums[i]) return false;
                i++;
            }
        }
        return true;
    }
};