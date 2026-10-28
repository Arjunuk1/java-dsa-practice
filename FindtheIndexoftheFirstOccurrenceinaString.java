public class FindtheIndexoftheFirstOccurrenceinaString {
        public int strStr(String hay, String need) {
        if (hay == null || need == null) {
            return -1;
        }

        return hay.indexOf(need);
    }
}
