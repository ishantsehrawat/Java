import java.io.*;
import java.util.*;

public class Main {

	public static StringBuilder toggleCase(String str){
		//write your code here
        StringBuilder s = new StringBuilder(str);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                char uch = (char)('A' + c - 'a');
                s.setCharAt(i, uch);
            }else if(c>='A' && c<='Z'){
                char lch = (char)('a' + c - 'A');
                s.setCharAt(i,lch);
            }
        }
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}