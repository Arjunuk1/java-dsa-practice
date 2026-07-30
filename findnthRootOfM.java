public class findnthRootOfM {
        public int nthRoot(int n, int m) {
        if (m == 0) return 0;
        int l = 1;
        int r = m;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long value = 1;
            for (int i = 0; i < n; i++) {
                value *= mid;
                if (value > m)
                    break;
            }
            if (value == m) {
                return mid;
            } else if (value < m) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
