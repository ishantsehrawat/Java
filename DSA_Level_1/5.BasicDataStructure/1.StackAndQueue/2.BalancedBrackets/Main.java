import java.io.*;
import java.util.*;

public class Main {

    private static boolean handleClosing(Stack<Character> st, char corresOCh){
        if(st.size() == 0){
            return false;
        } else if(st.peek() != corresOCh){
            return false;
        } else {
            st.pop();
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean ans;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            } else if(ch == ')'){
                ans = handleClosing(st, '(');
                if(ans == false){
                    System.out.println("false");
                    return;
                }
            } else if(ch == ']'){
                ans = handleClosing(st, '[');
                if(ans == false){
                    System.out.println("false");
                    return;
                }
            } else if(ch == '}'){
                ans = handleClosing(st, '{');
                if(ans == false){
                    System.out.println("false");
                    return;
                }
            }
        }
        if(st.size() == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}