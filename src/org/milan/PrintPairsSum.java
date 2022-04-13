package org.milan;

import java.util.HashMap;
import java.util.Map;

public class PrintPairsSum {

    public static void printPairsSum(int [] arr, int n  , int sum){

        Map<Integer,Integer> pair = new HashMap<>();
        for (int i=0;i<n;i++){
            int rem = sum - arr[i];
            if (pair.containsKey(rem))
            {
                int count = pair.get(rem);

                for(int j = 0; j < count; j++)
                    System.out.print("(" + rem +
                            ", " + arr[i] +
                            ")" + "\n");
            }
            if (pair.containsKey(arr[i]))
            {
                pair.put(arr[i], pair.get(arr[i]) + 1);
            }
            else
            {
                pair.put(arr[i], 1);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = { 1, 5, 7, -1, 5};
        int n = arr.length;
        int sum = 6;
        printPairsSum(arr,n,sum);
    }
}
