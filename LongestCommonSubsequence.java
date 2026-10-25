public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.isEmpty() || text2.isEmpty()) {
            return 0;
        }

        if (text1.length() < text2.length()) {
            String shorter = text1;
            text1 = text2;
            text2 = shorter;
        }

        int[] previous = new int[text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {
            int[] current = new int[text2.length() + 1];
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    current[j] = previous[j - 1] + 1;
                } else {
                    current[j] = Math.max(previous[j], current[j - 1]);
                }
            }
            previous = current;
        }

        return previous[text2.length()];
    }
}
