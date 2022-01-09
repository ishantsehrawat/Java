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
        firstIndex(a, 0, x);
    }

    public static void firstIndex(int[] arr, int idx, int x){
        if(arr.length == idx){
            System.out.println(-1);
            return ;
        }
        
        if(arr[idx] == x){
            System.out.println(idx);
            return ;
        }else {
            firstIndex(arr, idx + 1, x);

        }
    }

}