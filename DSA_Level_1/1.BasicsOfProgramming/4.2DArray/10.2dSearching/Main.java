import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        int[][] a = new int[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j] = Integer.parseInt(b.readLine());
            }
        }
        int x = Integer.parseInt(b.readLine());
        int flag = -1;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i][j] == x){
                    System.out.print(i + "\n" + j);
                    flag = 0;
                }
            }
        }
        if(flag == -1)
            System.out.println("Not Found");
    }

}