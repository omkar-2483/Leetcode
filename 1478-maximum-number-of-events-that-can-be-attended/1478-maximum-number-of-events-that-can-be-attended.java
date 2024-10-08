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

public class Solution {
    public int maxEvents(int[][] events) {
        // Sort events by start time, and if equal, by end time
        Arrays.sort(events, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];  // Sort by end time if start time is equal
            } else {
                return a[0] - b[0];  // Sort by start time
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int day = 0, maxAttend = 0, i = 0;
        int n = events.length;

        // Process days from the start of the earliest event to the latest end time
        for (day = 1; day <= 100000; day++) {
            // Add all events that start on this day to the priority queue
            while (i < n && events[i][0] == day) {
                pq.offer(events[i][1]);  // Add the event's end time
                i++;
            }

            // Remove events that have already ended (i.e., their end time is less than the current day)
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Attend the event that ends the earliest (if any)
            if (!pq.isEmpty()) {
                pq.poll();
                maxAttend++;
            }

            // Break if all events are processed and no further events can be attended
            if (i == n && pq.isEmpty()) {
                break;
            }
        }

        return maxAttend;
    }
}