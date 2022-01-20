import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
  
            return bres;
        }
        ArrayList<String> res1 = getStairPaths(n-1);
        ArrayList<String> res2 = getStairPaths(n-2);
        ArrayList<String> res3 = getStairPaths(n-3);
        ArrayList<String> mres = new ArrayList<>();

            
        for(String rstr: res1){
            mres.add(1 + rstr);
        }
        for(String rstr: res2){
            mres.add(2 + rstr);
        }
        for(String rstr: res3){
            mres.add(3 + rstr);
        }

        return mres;
    }

}