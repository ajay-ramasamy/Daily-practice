import java.util.*;
public class CountInversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        int count =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
