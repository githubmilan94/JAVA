package org.milan;

public class PairSum {

    public static boolean getPairSum(int [] arr, int sum){
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " " + arr[j] + " " + sum);
                    return  true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[]  arr = {4,1,2,3,7,9,5,9};
        int sum = 10;
        getPairSum(arr,sum);

    }
}
