import java.util.Stack;

public class EvaluateReversePolishNotation {
        public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<tokens.length;i++){
            String token = tokens[i];
        
        switch(token){
            case "+": {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first + second);
                break;
            }
            case "-": {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first - second);
                    break;
                }
            case "*": {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first * second);
                    break;
                }
            case "/": {
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first / second);
                    break;
                }
            default:
                    stack.push(Integer.parseInt(token));
                    break;
           }
        }
        return stack.pop();
    }
}
