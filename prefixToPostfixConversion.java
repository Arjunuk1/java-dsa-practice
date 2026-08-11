import java.util.Stack;

public class prefixToPostfixConversion {
        static String preToPost(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || 
                (ch >= 'a' && ch <= 'z') || 
                (ch >= '0' && ch <= '9')) {
                stack.push(String.valueOf(ch));
            } else {
                String first = stack.pop();
                String second = stack.pop();
                
                String result = first + second + ch;
                stack.push(result);
            }
        }

        return stack.pop();
    }
}
