import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    
	static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
        
        int max_index_1 = -1;
        int max_index_2 = -1;


        for (int i = 0; i < n; ++i) {
           if (max_index_1 == -1 || numbers[i] > numbers[max_index_1]){
           		max_index_1 = i;
           }
        }

        for (int j = 0; j < n; ++j) {
           if ((max_index_2 == -1 ||numbers[j] > numbers[max_index_2]) && j != max_index_1){
           		max_index_2 = j;
           }
        }

        result = (long)numbers[max_index_1] * numbers[max_index_2];

        return result;
    }


    static int getMaxPairwiseProductSlower(int[] numbers) {
        int result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (numbers[i] * numbers[j] > result) {
                    result = numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}