import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> res = gss(ros);

        ArrayList<String> myres = new ArrayList<>();
        for(String rstr:res){
            myres.add("" + rstr);
        }
        for(String rstr:res){
            myres.add(ch + rstr);
        }
        
        return myres;
    }

}