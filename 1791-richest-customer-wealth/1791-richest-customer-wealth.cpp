class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int max=0;
        for(int i=0; i<accounts.size(); i++){
            int cur =0;
            for(int j=0; j<accounts[0].size(); j++){
                cur+= accounts[i][j];
            }
            max = cur>max? cur: max;
        }
        return max;
    }
};