import java.util.Stack;

public class postfixToPrefixConversion {
        static String postToPre(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || 
                (ch >= 'a' && ch <= 'z') || 
                (ch >= '0' && ch <= '9')) {
                stack.push(String.valueOf(ch));
            } else {
                String second = stack.pop(); 
                String first = stack.pop();  

                String result = ch + first + second;
                stack.push(result);
            }
        }

        return stack.pop();
    }
}
