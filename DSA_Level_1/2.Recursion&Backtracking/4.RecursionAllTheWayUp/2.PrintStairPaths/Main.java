import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String num = s.next();
        ArrayList<String> res = getKPC(num);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    static String[] dial = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        int i;
        String ros = str.substring(1);

        ArrayList<String> res = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeForCh = dial[ch - 48];
        for(i=0;i<codeForCh.length();i++){
            char code = codeForCh.charAt(i);
            for(String rstr: res){
                mres.add(code + rstr);
            }
        }

        return mres;
    }

}