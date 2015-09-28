package homework2_matrix;

public class OneMatrix {
	
	//method which builds matrix and displays it given the length and width of the matrix
	public static void BuildMatrix (int rows, int columns) {
		
		final int matrix[][] = new int[rows][columns];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (i==j) {
					matrix[i][j] = 1;
				} else if (j==(matrix[i].length-i-1)) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		BuildMatrix(10,20);
		
	}

}
