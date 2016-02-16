/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snake;

/**
 *
 * @author Harshita V
 */
import java.util.ArrayList;

public class Snake {

	private static final int[][] board = new int[][] { 
		{ 1, 3, 2, 6, 8 },
		{ -9, 7, 1, -1, 2 }, 
		{ 1, 5, 0, 1, 9 } };

	public static void snackchecker(int grid[][]) {
		int maxlen = 0;
		int endr = 0;
		int endc = 0;
		
		int[][] dp = new int[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				dp[i][j] = 1;
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				if (i > 0 && Math.abs(board[i - 1][j] - board[i][j]) == 1) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + 1);
					maxlen = Math.max(maxlen, dp[i][j]);
					endr = i; endc = j;
				}
				if (j > 0 && Math.abs(board[i][j - 1] - board[i][j]) == 1) {
					dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + 1);
					maxlen = Math.max(maxlen, dp[i][j]);
					endr = i; endc = j;
				}
			}
		}
		System.out.println("snack length: " + maxlen);
		
		snacktrackback(dp, endr, endc);
	}
	
	public static void snacktrackback( int grid[][], int i, int j ){
		ArrayList<Integer> track = new ArrayList<Integer>();
		track.add(board[i][j]);
		
		while(grid[i][j] != 1){
			
			if(i > 0 && j > 0){
				if(grid[i][j] == grid[i - 1][j] + 1){
					track.add(board[i - 1][j]);
					i--;
				}else if(grid[i][j] == grid[i][j - 1] + 1){
					track.add(board[i][j - 1]);
					j--;
				}
				
			}else if(j == 0){
				if(grid[i][j] == grid[i - 1][j] + 1){
					track.add(board[i - 1][j]);
					i--;
				}
			}else if (i == 0){
				if(grid[i][j] == grid[i][j - 1] + 1){
					track.add(board[i][j - 1]);
					j--;
				}
			}
		}
		
		System.out.println(track);
	}
	

	public static void main(String[] args) {
		snackchecker(board);
	}

}
