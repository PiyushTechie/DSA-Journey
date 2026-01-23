public class minmizeDistToGasStations {
    public double minMaxDist(int[] stations, int K){
        double low = 0.0;
        double high = 0.0;
        for(int i = 0; i < stations.length; i++){
            high = Math.max(high, stations[i+1] - stations[i]);
        }

        while(high - low > 1e-6){
            double mid = low + (high - low)/2;

            if(isPossible(stations, K, mid)){
                high = mid;
            }else{
                low = mid;
            }
        }


        return high;
    }

    public boolean isPossible(int[] stations, int k, double dist){
        int needed = 0;
        for(int i = 0; i < stations.length; i++){
            double gap = stations[i+1] - stations[i];
            needed += (int) (gap / dist);
        }

        return needed <= k;
    }
}
