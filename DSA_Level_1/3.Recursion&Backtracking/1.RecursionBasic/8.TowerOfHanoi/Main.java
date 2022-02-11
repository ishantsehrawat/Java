import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t1 = s.nextInt();
        int t2 = s.nextInt();
        int t3 = s.nextInt();
        toh(n,t1,t2,t3);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n == 0){
            return;
        }
        
        toh(n - 1, t1id, t3id, t2id); // t1 has only 1 disc now, t2 is empty, t3 has two discs
        System.out.println(n + "[" + t1id + " -> " + t2id + "]"); // t1 is empty, t2 has 3rd disc, t3 has top two 
        toh(n - 1, t3id, t2id, t1id); // t1 is empty, t2 has all, t3 is empty    }
    }
}