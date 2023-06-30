
public class uniquePath {
	public static int uniquePaths(int m, int n) {
		int[][] mat = new int[m+1][n+1];

		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				mat[i][j] = -1;
			}
		}

		int num = countPath(0,0,m,n,mat);
		if(m==1 && n==1) return num;

		return mat[0][0];

	}

	public static int countPath(int i, int j, int m, int n, int[][] mat){
		if(i==m-1 && j==n-1) return 1;
		if(i>=m || j>=n) return 0;
		if(mat[i][j] != -1) return mat[i][j];
		else return mat[i][j] = countPath(i+1,j,m,n,mat) + countPath(i, j+1, m, n, mat);
	}
}