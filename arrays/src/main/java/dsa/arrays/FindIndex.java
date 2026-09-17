package dsa.arrays;
public class FindIndex {
    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return i;
            }

        }
        return -1;
    }
}
