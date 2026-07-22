public class LOngestrepCharRepl {
        public int characterReplacement(String s, int k) {
        int i = 0;
        int j = 0;
        int ans = 0;
        int maxfreq = 0;
        int freq[] = new int[26];
        while(j < s.length()){
            freq[s.charAt(j) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(j) - 'A']);
            if(j - i + 1 - maxfreq <= k){
                ans = Math.max(ans, j- i + 1);
                j++;
            }else{
                freq[s.charAt(i) - 'A']--;
                i++; j++;
            }
        }
        return ans;
    }
}
