//! 696. Count Binary Substrings
package Leetcode;

class Solution9 {
    public int countBinarySubstrings(String s) {
        int left = 0;
        int right = 1;
        int result =0;
        int n = s.length();
        for(int i=1; i<n;i++){
            if(s.charAt(i-1)==s.charAt(i)){
                right++;
            }
            else{
                result += Math.min(left,right);
                left = right;
                right = 1;
            }
        }
        result += Math.min(left,right);
        return result;
    }
}
