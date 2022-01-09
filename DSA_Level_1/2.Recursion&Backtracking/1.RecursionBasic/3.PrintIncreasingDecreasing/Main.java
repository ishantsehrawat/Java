import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pdi(n, n);
    }

    public static void pdi(int n,int i){
        System.out.println(i);
        if(i > 1){
            pdi(n, i-1);
        }
        System.out.println(i);
    }

}