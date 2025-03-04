class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0, curTank = 0, startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];
            totalTank += balance;
            curTank += balance;
            
            // If current tank is empty, reset the starting point
            if (curTank < 0) {
                startIndex = i + 1;
                curTank = 0;
            }
        }
        
        return (totalTank >= 0) ? startIndex : -1;
    }
}