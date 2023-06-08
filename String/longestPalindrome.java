package String;

public class longestPalindrome {
        public static String longestPalinSubstring(String str) {
            String curr = str.substring(0,1);
            String max = str.substring(0, 1);
            if(isPalindrome(str, 0, str.length()-1)) return str;
    
            for(int i=0; i<str.length(); i++){
                for(int j=i+1; j<=str.length(); j++){
                    if(isPalindrome(str, i, j-1)){
                        String s = str.substring(i, j);
                        curr = s;
                        if(curr.length() > max.length()) max = curr;
                    }
                }
            }
    
            return max;
    
        }
        public static boolean isPalindrome(String s,int i,int j){
            
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
        }
}
