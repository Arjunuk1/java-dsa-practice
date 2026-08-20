import java.util.Arrays;

public class shortestJobFirst {
        static int solve(int bt[]) {

        Arrays.sort(bt);
        int waitingTime = 0;
        int taskTime = 0;
        for(int i = 0;i<bt.length;i++){
            waitingTime += taskTime;
            taskTime += bt[i];
        }
        return waitingTime/bt.length;
    }
}
