package org.example;

class Solution {
    public static int totalNQueens(int n) {
     boolean [][]board=new boolean[n][n];
     return helper(board,0);

    }
    public static int helper(boolean [][] board,int r){
        int ans=0;
        if(board.length==r){
           ans++;

        }
        else{
            for(int c=0;c<board.length;c++){
                if(isSafe(board,r,c)){
                    board[r][c]=true;
                   ans+=helper(board,r+1);
                    board[r][c]=false;
                }
            }
        }
        return ans;
    }
    public static boolean isSafe(boolean [][] board,int r,int c){
        // vertical checking
        for(int i=1;i<=r;i++){
            if(board[r-i][c]){
                return false;
            }
        }
        // left diagonal
        int min=Math.min(r,c);
        for(int i=1;i<=min;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
         // right diagonal
         min=Math.min(r,board.length-1-c);
        for(int i=1;i<=min;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=totalNQueens(4);
        System.out.println(n);
    }
}