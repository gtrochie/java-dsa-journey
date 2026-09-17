package dsa.arrays;
public class FindMissingNumber {
    public static int findMissing(int[] arr, int n) {
        int actualSum = 0;
        int expectedSum = n * ( n + 1)/ 2;
        for (int i = 0; i < arr.length; i++){
            actualSum += arr[i];
        }
     return  expectedSum - actualSum;
    }
}
