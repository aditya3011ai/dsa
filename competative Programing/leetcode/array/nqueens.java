import java.util.*;

public class nqueens {
    static List<List<String>> res = new LinkedList<>();
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] cs : board) {
            Arrays.fill(cs, '.');
        }
        helper(board,0,0,n);
        return res;
    }
    public static void helper(char[][] board,int row,int col,int n){
        // col out of bounds check
        if(col==board[0].length){
            col =0;
            row++;
        }
        if(n==0){
            res.add(toString(board));
            return;
        }
        // row out of bounds check
        if(row==board.length){
            return;
        }
        if(isValid(board,row,col)){
        board[row][col] = 'Q';
        n--;
        helper(board, row, col, n);
        //backteack
        board[row][col] = '.';
        n++;
        }
        helper(board, row, col+1, n);
    }
    public static List<String> toString(char board[][]){
        List<String> list = new LinkedList<>();
        StringBuilder str;
        for (char[] cs : board) {
            str = new StringBuilder();
            for (char ch : cs) {
                str.append(ch);
            }
            list.add(str.toString());
        }
        return list;
    }
    public static boolean isValid(char[][]board, int row ,int col){
        int N= board.length;
        // Top and Down check
        for (int i = 0; i < board.length; i++) {
            if(board[i][col]!='.'){
                return false;
            }
            if(board[row][i]!='.'){
                return false;
            }
        }
        int i=row ,j=col;
        // Top left corner check
        while (i>=0&&j>=0) {
            if(board[i][j]!='.')return false;
            i--;
            j--;
        }
        // Top right
        i=row;
        j=col;
        while (i>=0&&j<N) {
            if(board[i][j]!='.')return false;
            i--;
            j++;
        }
        //down right;
       i=row;
       j=col;
        while(i<N && j<N){
            if(board[i][j]!='.')return false;
            i++;
            j++;
        }
       i=row;
       j=col;
        while(i<N && j>=0){
            if(board[i][j]!='.')return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
    solveNQueens(4);
    System.out.println(res);
  }
}