
import java.util.*;
// ! Problem : Area of parallelogram

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        if(base!=0 && height!=0){
            System.out.println(base*height);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
