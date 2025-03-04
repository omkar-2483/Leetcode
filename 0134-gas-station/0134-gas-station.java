class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;    // Total gas available
        int totalCost = 0;   // Total cost required
        int tank = 0;        // Current gas in the tank
        int start = 0;       // Starting station index

        // Iterate through each gas station
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            // If tank goes negative, we can't reach the next station
            if (tank < 0) {
                // Move starting point to the next station
                start = i + 1;
                tank = 0;  // Reset tank since we are starting fresh
            }
        }

        // Check if total gas is sufficient to cover total cost
        return totalGas >= totalCost ? start : -1;
    }
}