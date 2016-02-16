/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clockwisespiralmatrix;

/**
 *
 * @author Harshita V
 */
public class ClockWiseSpiralMatrix {
	public static void main(String args[]) {
		char[][] characterArray = { {'C', 'I', 'P', 'E'}, {'R', 'N', 'K', 'U'}, {'U', 'O', 'W', 'O'}, {'L', 'E', 'S', 'Y'}};
		int top = 0;
		int right = characterArray[0].length-1;
		int bottom = characterArray.length-1;
		int left = 0;
		
		System.out.println(right + " " + bottom);
		
		while(true){
			for(int i = right; i >= left; i--) 
				System.out.print(characterArray[top][i]);
			top++;
			
			if(top > bottom || left > right)
				break;
			
			for(int i = top; i <= bottom; i++)
				System.out.print(characterArray[i][left]);
			left++;
			
			if(top > bottom || left > right)
				break;
			
			for(int i = left; i <= right; i++)
				System.out.print(characterArray[bottom][i]);
			bottom--;
			
			if(top > bottom || left > right)
				break;
			
			for(int i = bottom; i >= top; i--)
				System.out.print(characterArray[i][right]);
			right--;
			
			if(top > bottom || left > right)
				break;

		}
	}
}
