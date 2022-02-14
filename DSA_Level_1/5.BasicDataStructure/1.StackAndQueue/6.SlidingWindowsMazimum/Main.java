import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        // code
        int[] ngetr = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        st.push(arr.length - 1);
        ngetr[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                ngetr[i] = arr.length;
            } else {
                ngetr[i] = st.peek();
            }

            st.push(i);
        }
        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }
            while (ngetr[j] < i + k) {
                j = ngetr[j];
            }

            System.out.println(arr[j]);
        }

    }
}