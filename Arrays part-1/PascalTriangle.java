
import java.util.ArrayList;

public class PascalTriangle {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
		for(int i=1; i<=n; i++){
			ans.add(solve(i));
		}

		return ans;	
	}
	public static ArrayList<Long> solve(int r){
		long ans = 1;
		ArrayList<Long> row = new ArrayList<>();
		row.add((long)1);
		for(int col=1; col<r; col++){
			ans = ans * (r - col);
			ans = ans/col;
			row.add(ans);
		}

		return row;
	}
}

