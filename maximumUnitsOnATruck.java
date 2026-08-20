import java.util.Arrays;

public class maximumUnitsOnATruck {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int ans = 0;
        for(int boxes[] : boxTypes){
            int box = Math.min(boxes[0], truckSize);
            ans += box*boxes[1];
            truckSize -= box;
            if(truckSize == 0){
                break;
            }
        }
        return ans;
    }
}
