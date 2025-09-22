package Leetcode;

//! Problem : Smallest Absent Positive Greater Than Average

class Solution1 {
    public int smallestAbsent(int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = sum / nums.length;
        
        int start = (int) Math.floor(avg) + 1;
        if (start < 1) {
            start = 1;
        }
        
        boolean[] present = new boolean[102]; 
        for (int num : nums) {
            if (num > 0 && num <= 101) {
                present[num] = true;
            }
        }
        
        for (int i = start; i <= 101; i++) {
            if (!present[i]) {
                return i;
            }
        }
        
        return 102;
    }
    
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.smallestAbsent(new int[]{4,3,2,1}));
        System.out.println(sol.smallestAbsent(new int[]{1,2,6,10,5,7}));
    }
}
