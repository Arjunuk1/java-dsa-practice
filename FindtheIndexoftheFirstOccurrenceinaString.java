public class FindtheIndexoftheFirstOccurrenceinaString {
        public int strStr(String hay, String need) {
        int h1 = hay.length();
        int n1 = need.length();

        if(n1>h1) return -1;

        if(hay.contains(need)){
            return hay.indexOf(need);
        }
        return -1;
    }
}
