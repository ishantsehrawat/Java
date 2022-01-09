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
        System.out.println(maxOfArray(a,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int max = maxOfArray(arr, idx + 1);
        if(max < arr[idx]){
            return arr[idx];
        }else {
            return max;
        }
    }

}