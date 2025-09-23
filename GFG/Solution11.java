//! Union of Two Arrays

package GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution11 {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();
        for(int i:a){
            st.add(i);
        }
        
        for(int j:b){
            st.add(j);
        }
        
        for(int it:st){
            ans.add(it);
        }
        
        Collections.sort(ans);
        return ans;
        
    }
}
