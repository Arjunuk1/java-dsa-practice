import java.util.Stack;

public class minimumremovetomakevalidparanthesis {
        public String minRemoveToMakeValid(String s) {
        int n = s.length();
        boolean[] removeIndex = new boolean[n];
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    removeIndex[i] = true;
                }
            }
        }
        while (!st.isEmpty()) {
            removeIndex[st.pop()] = true;
        }
        for (int i = 0; i < n; i++) {
            if (!removeIndex[i]) {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
