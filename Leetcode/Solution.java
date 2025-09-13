package Leetcode;

//!Problem : Find Most Frequent Vowel and Consonant

public class Solution {
    public int maxFreqSum(String s) {
        int a=0,e=0,i=0,o=0,u=0;
        int fre[] = new int[26];
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(ch=='a')a++;
            else if(ch=='e')e++;
            else if(ch=='i')i++;
            else if(ch=='o')o++;
            else if(ch=='u')u++;
            else{
                fre[ch-'a'] += 1;
            }
        }
        int vow=0,con=0;
        vow = Math.max(vow,a);
        vow = Math.max(vow,e);
        vow = Math.max(vow,i);
        vow = Math.max(vow,o);
        vow = Math.max(vow,u);
        for(int j=0;j<26;j++){
            con = Math.max(con,fre[j]);
        }
        return con+vow;
    }
}
