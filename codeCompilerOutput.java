import java.util.*;

public class codeCompilerOutput {
    
    public static boolean balanced(String str){

        Stack<Character> st = new Stack<>();

        for(int i = 0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch == '{' || ch =='[' || ch == '('){
                st.push(ch);
            }

            else if(ch == '}' || ch == ']' || ch == ')'){
                if(st.isEmpty()){
                    return false;
                }

                char top = st.pop();

                if(ch == ')' && top != '('){
                    return false;
                }if(ch == '}' && top != '{'){
                    return false;
                }if(ch == ']' && top != '['){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0)
        {
            String str = sc.nextLine();

            if(balanced(str))
            {
                System.out.println("Success");
            }
            else
            {
                System.out.println("Error");
            }
        }
    }
}
