// import java.io.*;
// import java.util.*;

// public class Main{

// public static void main(String[] args) throws Exception {
//     // write your code here
//     Scanner s = new Scanner(System.in);
//     int n1 = s.nextInt();
//     int m1 = s.nextInt();
//     int[][] a1 = new int[n1][m1];

//     int i,j,k;
//     for(i=0;i<n1;i++){
//         for(j=0;j<m1;j++){
//             a1[i][j] = s.nextInt();
//         }
//     }

//     int n2 = s.nextInt();
//     int m2 = s.nextInt();
//     int[][] a2 = new int[n2][m2];
//     for(i=0;i<n2;i++){
//         for(j=0;j<m2;j++){
//             a2[i][j] = s.nextInt();
//         }
//     }
    
//     if(n2 != m1) {
//         System.out.println("Invalid Matrices");
//     }

//     int sum = 0;
//         int[][] mul = new int[n1][m2];
//         for(i=0;i<n1;i++){
//             sum = 0;
//             for(j=0;j<m2;j++){
//                 for(k=0;k<n2;k++){
//                     sum += a1[i][k]*a2[k][j];
//                     System.out.println(mul[i][j]);
//                 }
//                 mul[i][j] = sum;
//             }
//         }
//         for(i=0;i<n2;i++){
//             for(j=0;j<m1;j++){
//                 System.out.print(mul[i][j] + " ");
//             }
//             System.out.println();
//         }
    
//  }

// }

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n1 = Integer.parseInt(br.readLine());
      int m1 = Integer.parseInt(br.readLine());
      int[][] arr1 = new int[n1][m1];

      for (int i = 0; i < n1; i++) {
         for (int j = 0; j < m1; j++) {
            arr1[i][j] = Integer.parseInt(br.readLine());
         }
      }

      int n2 = Integer.parseInt(br.readLine());
      int m2 = Integer.parseInt(br.readLine());
      int[][] arr2 = new int[n2][m2];

      for (int i = 0; i < n2; i++) {
         for (int j = 0; j < m2; j++) {
            arr2[i][j] = Integer.parseInt(br.readLine());
         }
      }

      if (m1 != n2) {
         System.out.println("Invalid input");
         return;
      }

      int[][] prd = new int[n1][m2];
      for (int i = 0; i < n1; i++) {
         for (int j = 0; j < m2; j++) {
            int sum = 0;

            for (int k = 0; k < m1; k++) {
               sum += arr1[i][k] * arr2[k][j];
            }

            prd[i][j] = sum;
         }
      }

      for (int i = 0; i < n1; i++) {
         for (int j = 0; j < m2; j++) {
            System.out.print(prd[i][j] + " ");
         }
         System.out.println();
      }

   }
}