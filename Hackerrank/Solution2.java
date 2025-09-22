

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int n = A.length() + B.length();
        System.out.println(n);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String res = A.substring(0,1).toUpperCase()+A.substring(1);
        String res1 = B.substring(0,1).toUpperCase()+B.substring(1);
        
        System.out.println(res+" "+res1);
        sc.close();
        
    }
}
