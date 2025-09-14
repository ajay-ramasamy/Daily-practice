public class Solution1 {
    public static void main(String[] args) {
        System.out.println(reverseWords("..pqr.mno..")); 
        System.out.println(reverseWords("i.like.this.program.very.much")); 
    }

    private static String reverseWords(String s) {
       
        while (s.length() > 0 && s.charAt(0) == '.') {
            s = s.substring(1);
        }

       
        int p = s.length() - 1;
        while (p >= 0 && s.charAt(p) == '.') {
            s = s.substring(0, p);
            p--;
        }

        if (s.isEmpty()) {
            return "";
        }

        String str[] = s.split("\\.");
        
        StringBuilder k = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            k.append(str[i]);
            if (i != 0) { 
                k.append(".");
            }
        }
        return k.toString();
    }
}
