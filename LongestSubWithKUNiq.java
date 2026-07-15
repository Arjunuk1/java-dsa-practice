import java.util.HashMap;

public class LongestSubWithKUNiq {
        public int longestKSubstr(String s, int k) {
        int i = 0, j = 0;
        int ans = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while (j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            if (map.size() < k) {
                j++;
            } else {
                if (map.size() == k) {
                    ans = Math.max(ans, j - i + 1);
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
