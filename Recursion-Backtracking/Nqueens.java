import java.util.ArrayList;

public class Nqueens {

    private static ArrayList<Integer> construct(int[][] board){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                ans.add(board[i][j]);
            }
        }

        return ans;
    }
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int[][] board = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 0;
            }
        }

        solve(ans,board,0);

        return ans;
    }

    private static void solve(ArrayList<ArrayList<Integer>> ans, int[][] board, int col){
        if(col == board.length){
            ans.add(construct(board));
            return;
        }

        for(int row = 0; row<board.length; row++){
            if(check(board,row,col)){
                board[row][col] = 1;
                solve(ans,board,col+1);
                board[row][col] = 0;
            }
        }
    }

    private static boolean check(int[][] board, int row, int col){
        int duprow = row;
        int dupcol = col;

        while(row>=0 && col>=0){
            if(board[row][col] == 1) return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;

        while(col>=0){
            if(board[row][col] == 1) return false;
            col--;
        }

        row = duprow;
        col = dupcol;

        while(row<board.length && col>=0){
            if(board[row][col] == 1) return false;
            row++;
            col--;
        }

        return true;
    }
}