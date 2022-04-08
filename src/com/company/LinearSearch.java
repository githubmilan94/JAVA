package com.company;

public class LinearSearch {

    public static int linearSearch(int [] arr, int search){
        for(int i=0;i<arr.length -1;i++){
            if (arr[i] == search)

            //return arr[i];
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {3,4,5,7,1,54,32,88,12,32,};
        int search = 12;
        System.out.println(linearSearch(arr,search));

    }
}
