package dsa.arrays;

import java.util.Arrays;

public class CountDuplicates {

    public static int countDuplicates(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == arr[i+1]){
                count++;
            }
        }



        return count;
    }
}
