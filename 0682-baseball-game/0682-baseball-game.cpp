class Solution {
public:
    int calPoints(vector<string>& operations) {
        vector<int> records;
        int sum=0;
        for(string str : operations){
            if(str == "+"){
                int n=records.size();
                records.push_back(records[n-1]+records[n-2]);
                sum+=records.back();
            }else if(str == "D"){
                records.push_back(2*records[records.size()-1]);
                sum+=records.back();
            }else if(str == "C"){
                sum-=records.back();
                records.pop_back();
            }else{
                records.push_back(stoi(str));
                sum+= records.back();
            }
        }
        return sum;
    }
};