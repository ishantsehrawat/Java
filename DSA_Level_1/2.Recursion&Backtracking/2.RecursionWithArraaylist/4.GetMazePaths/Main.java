import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<String> res = getMazePaths(1, 1, n, m);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        } else if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;    
        }
        ArrayList<String> hpath = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> vpath = getMazePaths(sr+1, sc, dr, dc);


        ArrayList<String> mpath = new ArrayList<>();
        for(String rpath: hpath){
            mpath.add('h' + rpath);
        } 
        for(String rpath: vpath){
            mpath.add('v' + rpath);
        } 

        return mpath;
    }

}