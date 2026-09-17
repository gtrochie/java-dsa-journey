package dsa.arrays;
public class CountPosNeg {
    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                count++;
            }
        }

        return count; }
    public static int countNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;

            }

        }
        return count;
    }
}
