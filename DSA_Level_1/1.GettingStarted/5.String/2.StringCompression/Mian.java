import java.io.*;
import java.util.*;

public class Main {

	public static StringBuilder compression1(String str){
		// write your code here
		StringBuilder scomp = new StringBuilder();
		scomp.append(str.charAt(0));
		for(int i=1;i<str.length();i++){
			if(scomp.charAt(scomp.length() - 1) != str.charAt(i)){
				scomp.append(str.charAt(i));
			}
		}
		return scomp;
	}

	public static StringBuilder compression2(String str){
		// write your code here
		StringBuilder scomp = new StringBuilder();
		scomp.append(str.charAt(0));
		int count = 1;
		for(int i=1;i<str.length();i++){
			if(scomp.charAt(scomp.length() - 1) != str.charAt(i)){
				if(count != 1){
					scomp.append(count);
				}
				scomp.append(str.charAt(i));
				count = 1;
			}else if(i == str.length() - 1){
				if(count != 0){
					scomp.append(count+1);
				}
			}else{
				count++;
			}
		}
		return scomp;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}