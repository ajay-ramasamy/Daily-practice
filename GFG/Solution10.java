//! Intersection of Two Arrays

package GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution10 {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<a.length;i++){
            st.add(a[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            if(st.contains(b[i]) && !ans.contains(b[i])){
                ans.add(b[i]);
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
}
