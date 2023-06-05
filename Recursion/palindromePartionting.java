package Recursion;

import java.util.List;
import java.util.ArrayList;

public class palindromePartionting {
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        solve(res,new ArrayList<String>(), s);

        return res;
    }
    public static void solve(List<List<String>> res, ArrayList<String> sublist, String s){
        if(s == null || s.length() ==0){
            res.add(new ArrayList<>(sublist));
            return;
        }

        for(int j=1; j<=s.length(); j++){
            if(isPalindrome(s.substring(0,j))){
                sublist.add(s.substring(0,j));
                solve(res,sublist,s.substring(j,s.length()));
                sublist.remove(sublist.size()-1);
            }
        }
        return;
    }
    public static boolean isPalindrome(String s){
        int l = 0;
        int h = s.length()-1;
        while(l<=h){
            if(s.charAt(l)!=s.charAt(h)) return false;
            l++;
            h--;
        }
        return true;
    }
}

