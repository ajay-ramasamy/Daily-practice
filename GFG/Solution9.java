package GFG;
//! Count pairs with given sum

import java.util.Arrays;

public class Solution9 {
    int countPairs(int arr[], int tar) {
        
        Arrays.sort(arr);
        int n = arr.length;
        int lt =0,rt=n-1;
        int res =0;
        while(lt<rt){
            if(arr[lt]+arr[rt]<tar){
                lt++;
            }
            else if(arr[lt]+arr[rt]>tar){
                rt--;
            }
            else{
                int c1=0,c2=0;
                int e1 = arr[lt], e2 = arr[rt];
                while(lt<=rt && arr[lt]==e1){
                    c1++;
                    lt++;
                }
                while(lt<=rt && arr[rt]==e2){
                    c2++;
                    rt--;
                }
                if(e1==e2){
                    res += (c1*(c1-1)/2);
                }
                else{
                    res += c1*c2;
                }
            }
        }
        return res;
    }
}
