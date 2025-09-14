import java.util.ArrayList;
import java.util.HashSet;

//! Array Duplicates
 
public class Solution2 {
    class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.contains(arr[i])){
                a.add(arr[i]);
            }
            else{
                s.add(arr[i]);
            }
        }
        
        return a;
    }
}
}
