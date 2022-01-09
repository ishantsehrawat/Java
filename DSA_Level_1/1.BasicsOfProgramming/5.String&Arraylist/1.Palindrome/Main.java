import java.io.*;
import java.util.*;

public class Main {

	public static boolean ispalindrome(String ss){
		int i = 0,j = ss.length()-1;
		while(i <= j){
			char aageKaLetter = ss.charAt(i);
			char pichheKaLetter = ss.charAt(j);
			if(aageKaLetter != pichheKaLetter){
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;

	}

	public static void solution(String str){
		//write your code here
		int i,j;
		for(i=0;i<str.length();i++){
			for(j=i+1;j<=str.length();j++){
				String sS = str.substring(i,j);
				if(ispalindrome(sS) == true){
					System.out.println(sS);
				} 
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}