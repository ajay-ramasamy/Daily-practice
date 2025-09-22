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
    
    public static void main(String[] args) {
        Solution2 sol2 = new Solution2();
        Solution sol = sol2.new Solution();
        System.out.println(sol.findDuplicates(new int[]{2,3,1,2,3}));
        System.out.println(sol.findDuplicates(new int[]{0,3,1,2}));
    }
}
