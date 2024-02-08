package org.Jose;

import java.util.Arrays;

public class SumArray {
    public int repeats(int[] arr){
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == 0 && arr[i] != arr[i+1]){
                sum += arr[i];
            } else if(i == arr.length - 1 && arr[i] != arr[i-1]){
                sum += arr[i];
            } else if(i > 0 && i < arr.length - 1 && arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                sum += arr[i];
            }
        }
        return sum;
    }
}