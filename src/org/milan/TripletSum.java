package org.milan;

public class TripletSum {

    public static boolean getTripLetSum(int [] arr, int n , int sum){
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < n - 2; i++) {

            // Fix the second element as A[j]
            for (int j = i + 1; j < n - 1; j++) {

                // Now look for the third number
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.print("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return true;
                    }
                }
            }
        }
        // If we reach here, then no triplet was found
        return false;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int n = arr.length;

        getTripLetSum(arr,n,sum);

    }
}
