import java.util.List;
import java.util.ArrayList;


public class printallpemutations {
    public static List<String> findPermutations(String s) {
        List<String> ans = new ArrayList<>();

        StringBuilder ds = new StringBuilder();
        boolean[] map = new boolean[s.length()];

        solve(ans,s,ds,map,0);

        return ans;
    }

    public static void solve(List<String> ans, String s,StringBuilder ds, boolean[] map, int idx){
        if(idx>=s.length()){
            ans.add(new String(ds));
            return;
        }

        for(int i=0; i<s.length(); i++){
            if(!map[i]){
                ds.append(s.charAt(i));
                map[i] = true;

                solve(ans, s,ds,map,idx+1);

                ds.deleteCharAt(ds.length()-1);
                map[i] = false;

            }
        }
    }
}
