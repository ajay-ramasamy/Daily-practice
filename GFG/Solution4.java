package GFG;
import java.util.Stack;
//! valid parenthesis
public class Solution4 {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(st.peek()=='(' && ch==')'){
                st.pop();
            }
            else if(st.peek()=='[' && ch==']'){
                st.pop();
            }
            else if(st.peek()=='{' && ch=='}'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
    
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.isBalanced("()[]{}")); 
        System.out.println(sol.isBalanced("([)]")); 
        System.out.println(sol.isBalanced("{[]}")); 
    }
}
