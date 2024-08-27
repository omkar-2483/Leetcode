class Solution {

    //brute force
    // public int timeRequiredToBuy(int[] tickets, int k) {
    //     int time=0;
    //     while(tickets[k]!=0){
    //         for(int i=0; i<tickets.length; i++){
    //             if(tickets[k]==0) break;
    //             if(tickets[i]!=0){
    //                 tickets[i]--;
    //                 time++;
    //             }
    //         }
    //     }
    //     return time;
    // }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int sec = 0;
        int pos = tickets.length - (k+1);
        for(int i = 0; i < tickets.length; i++){
            if(i <= k)
                sec += Math.min(tickets[k], tickets[i]);
            else
                sec += Math.min(tickets[k]-1, tickets[i]);
        }
        return sec;
    }
}