
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        
        printMazePaths(0,0,dr-1,dc-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr>dr || sc > dc){
            return;
        }
        if(sr== dr && sc == dc){
            System.out.println(psf);
            return;
        }
        //horizontal
        for(int jumps = 1;jumps<=dc-sc;jumps++){
        printMazePaths(sr,sc+jumps,dr,dc,psf+"h"+jumps);
        }
        //vertical
        for(int jumps = 1;jumps<= dr-sr;jumps++){
        printMazePaths(sr+jumps,sc,dr,dc,psf+"v"+jumps);
        }
        //diagonal
        for(int jumps = 1;jumps<= Math.min(dr-sr,dc-sc);jumps++){
        printMazePaths(sr+jumps,sc+jumps,dr,dc,psf+"d"+jumps);
        }
    }

}