package org.happy;

public class SnakePattern {

	public static void printMatrixInSnakePattern(char[][] matrix) {
		int rows = matrix.length;
		int col = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			// even row then Left to right
			if (i % 2 == 0) {
				for (int j = 0; j < col; j++) {
					System.out.print(matrix[i][j] + " ");
				}
			}
			// odd row then Right to Left
			else {
				for (int j = col - 1; j >= 0; j--) {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char [] [] matrix={ {'A','B','C','D'},
		{'E','F','G','H'},
		{'I','J','K','L'}, 
		{'M','N','O','P'} };
		
		printMatrixInSnakePattern(matrix);
	}

}
