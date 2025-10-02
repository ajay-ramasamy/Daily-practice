import java.util.*;
public class CourseFind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Invalid Range");
        }
        else{
            String course[] = new String[n];
            for(int i=0;i<n;i++){
                course[i] = sc.nextLine();
            }
            sc.nextLine();
            String s  = sc.nextLine();
            boolean  found = false;
            for(int i=0;i<n;i++){
                if(course[i].equals(s)){
                    found = true;
                }
            }
            if(found){
                System.out.println(s+" course is available");
            }
            else{
                System.out.println(s+" course is not available");
            }
        }
    }
}
