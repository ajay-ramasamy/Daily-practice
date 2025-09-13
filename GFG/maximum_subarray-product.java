package GFG;

// ! Problem : Maximum product subarray

class Solution {
    int maxProduct(int[] arr) {
       
       if(arr.length==0){
           return 0;
       }
       int max = arr[0];
       int min = arr[0];
       int res = arr[0];
       for(int i=1;i<arr.length;i++){
           int n = arr[i];
           int temp = Math.max(n,Math.max(n*max,n*min));
           min = Math.min(n,Math.min(n*max,n*min));
           max = temp;
           res = Math.max(res,max);
       }
       return res;
    }
}