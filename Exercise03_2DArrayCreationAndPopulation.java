/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class Exercise03_2DArrayCreationAndPopulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] my2D = populate2DArray(4, 3);
		print2DArrayToConsole(my2D);
		
	}

	public static int[][] populate2DArray(int row, int col) {
		int [][] my2D = new int[row][col];
		
		int counter = 0;
		
		for (int i = 0 ; i < my2D.length; i++) {
			for (int j = 0; j < my2D[i].length ; j++) {
				my2D[i][j] = 2 + counter * 2;
				counter++;
			}
		}
		return my2D;
	}

	private static void print2DArrayToConsole(int[][] my2D) {
		for (int i = 0 ; i < my2D.length; i++) {
			for (int j = 0; j < my2D[i].length ; j++) {
				System.out.print("[" + my2D[i][j] + "] \t");
			}
			System.out.println();
		}
	}

}
