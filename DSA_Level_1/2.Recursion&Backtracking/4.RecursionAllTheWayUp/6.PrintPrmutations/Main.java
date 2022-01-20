import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i=0; i<str.length();i++){
            printPermutations(str.substring(0,i) + str.substring(i+1), asf + str.charAt(i));
        }
    }

}