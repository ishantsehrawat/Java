import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<String> res = getMazePaths(1, 1, n, m);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> mypath  = new ArrayList<>();
        
        for(int i=1;i<=dc-sc;i++){
            ArrayList<String> hpaths = getMazePaths(sr, sc + i, dr, dc);
            for(String hpath: hpaths){
                mypath.add("h" + i + hpath);
            }
        }

        for(int i=1;i<=dr-sr;i++){
            ArrayList<String> vpaths = getMazePaths(sr + i, sc, dr, dc);
            for(String vpath: vpaths){
                mypath.add("v" + i + vpath);
            }
        }

        for(int i=1;i<=dr-sr && i<=dc-sc;i++){
            ArrayList<String> dpaths = getMazePaths(sr + i, sc + i, dr, dc);
            for(String dpath: dpaths){
                mypath.add("d" + i + dpath);
            }
        }

        return mypath;
    }

}