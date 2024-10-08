// class Solution {
    // public int maxEvents(int[][] events) {
    //     //sort based on end day
    //     Arrays.sort(events, Comparator.comparingDouble(a-> a[1]));

    //     //get max end day
    //     int max=0;
    //     for(int[] row: events){
    //         if(row[1]>max)max=row[1];
    //     }

    //     int[] appointed= new int[max+1];
    //     int ans=0;
    //     for(int i=0; i<events.length; i++){
    //         for(int j= events[i][0]; j<=events[i][1];j++){
    //             if(appointed[j]==0){
    //                 ans++;
    //                 appointed[j]=1;
    //                 break;
    //             }
    //         }
    //     }
    //     return ans;

    // }
    // }

class Solution {
    public int maxEvents(int[][] events) {
        int days = 0;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        int i = 0, res = 0;
        while(i < events.length || !pq.isEmpty()) {
            if(pq.isEmpty()) {
                days = events[i][0];
            }
            while(i < events.length && events[i][0] <= days) {
                pq.add(events[i][1]);
                i++;
            }
            if(!pq.isEmpty()) {
                pq.poll();
                days++;
                res++;
            }
            while(!pq.isEmpty() && pq.peek() < days) pq.poll();
        }    
        return res;
    }
}