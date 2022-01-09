import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.print(power(x,n));

    }

    public static int power(int x, int n){
        if(n == 1){
            return x;
        }else if(n == 0){
            return 1;
        }else {
            return x*power(x,n-1);
        }
    }

}