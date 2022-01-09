import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();

        }
        int x = s.nextInt();
        lastIndex(a, a.length - 1, x);
    }

    public static void lastIndex(int[] arr, int idx, int x){
        if(idx == 0){
            return ;
        }
        if(arr[idx] == x){
            System.out.println(idx);
            return ;
        }
        lastIndex(arr, idx - 1, x);
    }

}