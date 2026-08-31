import java.util.ArrayList;

public class searchPatternGFG {
        ArrayList<Integer> search(String pat, String txt) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;

        while (i <= txt.length() - pat.length()) {

            int j = 0;

            while (j < pat.length() && 
                   txt.charAt(i + j) == pat.charAt(j)) {
                j++;
            }

            if (j == pat.length()) {
                ans.add(i);
            }

            i++;
        }

        return ans;
    }
}
