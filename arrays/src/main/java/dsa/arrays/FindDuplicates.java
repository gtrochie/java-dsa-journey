package dsa.arrays;
import java.util.List;
import java.util.ArrayList;
public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
        for (int num : arr){
            if(seen.contains(num)){
                if(!duplicates.contains(num)){
                    duplicates.add(num);
                }
            }
            else{
                seen.add(num);
            }

        }
        return duplicates; }
}
