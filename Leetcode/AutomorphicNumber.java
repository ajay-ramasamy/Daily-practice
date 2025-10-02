import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        if(n>9){
            int n1 = n;
            int n2 = square;
            boolean found = true;
            while(n1!=0){
                int r1 = n1%10;
                int r2 = n2%10;
                if(r1!=r2){
                    found = false;
                    break;
                }
                n1/=10;
                n2/=10;
            }
            if(found){
                System.out.println("Automorphic Number");
            }
            else{
                System.out.println("Not Automorphic Number");
            }
        }
        else if(n == square%10){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
    }
}
