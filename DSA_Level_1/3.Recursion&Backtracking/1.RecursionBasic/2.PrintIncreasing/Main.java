import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printIncreasing(n,1);
    }

    public static void printIncreasing(int n, int i){
        System.out.println(i);
        if(i<n){
            printIncreasing(n, i+1);
        }
    }

}