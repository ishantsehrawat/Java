import java.io.*;
import java.util.*;

public class Main {

  public static void sort01(int[] arr){
    //write your code here
    int c0=0,c1=0;
    
    while(c1<=arr.length-1){
      if(arr[c1] == 0){
        swap(arr,c1,c0);
        c0++;
        c1++;
      }else{
        c1++;

      }
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}