public class Carpooling {
        public boolean carPooling(int[][] trips, int capacity) {
        int[] timeline = new int[1001];

        for (int[] trip : trips) {
            int passengers = trip[0];
            int from = trip[1];
            int to = trip[2];

            timeline[from] += passengers; 
            timeline[to] -= passengers;   
        }

        int currentPassengers = 0;
        for (int passengersAtLocation : timeline) {
            currentPassengers += passengersAtLocation;
            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;
    }
}
