package conway;

/**
 * 
 *
 */
public class Conway {

	private int rows, cols;
	private boolean [][] alive;

	public Conway(int rows, int cols){
		this.rows = rows;
		this.cols = cols;
		this.alive = new boolean[rows][cols];

	}


	public int getRows(){
		return this.rows;
	}

	public int getColumns(){
		return this.cols;
	}
	
	public boolean [][] getArray() {
		return this.alive;
	}

	/**
	 * Sets the current status of the cell at (row, col)
	 * @param b if true, the cell is alive; if false, the cell is dead 
	 * @param row
	 * @param col
	 */
	public void setLiveness(boolean b, int row, int col){
		this.alive[row][col] = b;
	}


	/**
	 *  
	 * @param row
	 * @param col
	 * @return whether or not a cell at a specific row and column is alive. 
	 *    If row or col is out of bounds, you must return false.
	 */
	public boolean isAlive(int row, int col){
		if (row >= this.alive.length || row < 0) return false;
		if (col >= this.alive[row].length || col < 0) return false;
		return this.alive[row][col];
	}


	/**
	 * Make every cell not alive
	 */
	public void clear(){
		this.alive = new boolean [this.rows][this.cols];
	}


	/**
	 * Consider the 3x3 cell array that has the cell at (row, col) at its center.
	 * Let's call all cells but that center cell the neighbors of that center cell.
	 * This method returns the number of neighbors that are alive.
	 * 
	 *   n  n  n
	 *   n  c  n
	 *   n  n  n
	 *   
	 *  Above, if c represents the cell at (row, col), each n is
	 *  a neighbor of c, according to the above definition.
	 *  The result is at most 8 and at least 0.
	 * 
	 * @param row
	 * @param col
	 * @return the number of living neighbors
	 */
	public int countLivingNeighbors(int row, int col){
		int count = 0;
		if (isAlive(row - 1, col - 1) == true) {
			count = count + 1;
		}
		if (isAlive(row - 1, col) == true) {
			count = count + 1;
		}
		if (isAlive(row - 1, col + 1) == true) {
			count = count + 1;
		}
		if (isAlive(row, col - 1) == true) {
			count = count + 1;
		}
		if (isAlive(row, col + 1) == true) {
			count = count + 1;
		}
		if (isAlive(row + 1, col - 1) == true) {
			count = count + 1;
		}
		if (isAlive(row + 1, col) == true) {
			count = count + 1;
		}
		if (isAlive(row + 1, col + 1) == true) {
			count = count + 1;
		}
		return count;
	}

	/**
	 * Executes a generation of life.  Be sure to read the specification
	 * for this assignment, because it points out a common mistake students
	 * make when implementing this method.
	 * 
	 */
	public void step(){
		Conway next = new Conway(this.rows, this.cols);
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				if (countLivingNeighbors(i, j) < 2) next.setLiveness(false, i, j);
				if (countLivingNeighbors(i, j) > 3) next.setLiveness(false, i, j);
				if (isAlive(i, j) == true && (countLivingNeighbors(i, j) == 2 || countLivingNeighbors(i, j) == 3)) next.setLiveness(true, i, j);
				if (isAlive(i, j) == false && countLivingNeighbors(i, j) == 3) next.setLiveness(true, i, j);
			}
		}
		this.alive = next.getArray();
			}
		
	



	/**
	 * creates a blinker
	 */
	public void blinker() {

		if (this.getRows() < 3 || this.getColumns() < 3) {
			System.out.println("Grid is too small for premade pattern Blinker. " +
					"Conway must be at least 3x3");
		}
		else {
			this.setLiveness(true, 1, 0);
			this.setLiveness(true, 1, 1);
			this.setLiveness(true, 1, 2);
		}
	}

	public void fourBlinkers() {
		clear();
		if (this.getRows() < 9 || this.getColumns() < 9) {
			System.out.println("Grid is too small for premade pattern Four Blinkers. " +
					"Conway must be at least 9x9");
		}
		else {
			for (int i = 3; i < 6; i++) {
				for (int j = 3; j < 6; j++) {
					this.setLiveness(true, i, j);
				}
			}
		}
	}


	public void gosperGliderGun() {
		clear();
		if (this.getRows() < 50 || this.getColumns() < 50) {
			System.out.println("Grid is too small for premade pattern Gosper Glider Gun. " +
					"Conway must be at least 50x50");
		}
		else {
			this.setLiveness(true,0,27);
			this.setLiveness(true,1,25);
			this.setLiveness(true,1,27);
			this.setLiveness(true,2,15);
			this.setLiveness(true,2,16);
			this.setLiveness(true,2,23);
			this.setLiveness(true,2,24);
			this.setLiveness(true,2,37);
			this.setLiveness(true,2,38);
			this.setLiveness(true,3,14);
			this.setLiveness(true,3,18);
			this.setLiveness(true,3,23);
			this.setLiveness(true,3,24);
			this.setLiveness(true,3,37);
			this.setLiveness(true,3,38);
			this.setLiveness(true,4,3);
			this.setLiveness(true,4,4);
			this.setLiveness(true,4,13);
			this.setLiveness(true,4,19);
			this.setLiveness(true,4,23);
			this.setLiveness(true,4,24);
			this.setLiveness(true,5,3);
			this.setLiveness(true,5,4);
			this.setLiveness(true,5,13);
			this.setLiveness(true,5,17);
			this.setLiveness(true,5,19);
			this.setLiveness(true,5,20);
			this.setLiveness(true,5,25);
			this.setLiveness(true,5,27);
			this.setLiveness(true,6,13);
			this.setLiveness(true,6,19);
			this.setLiveness(true,6,27);
			this.setLiveness(true,7,14);
			this.setLiveness(true,7,18);
			this.setLiveness(true,8,15);
			this.setLiveness(true,8,16);


		}
	}

	public void glider() {
		clear();
		if (this.getRows() < 10 || this.getColumns() < 10) {
			System.out.println("Grid is too small for premade pattern Four Blinkers. " +
					"Conway must be at least 10x10");
		}
		else {

			this.setLiveness(true,1,1);
			this.setLiveness(true,1,3);
			this.setLiveness(true,2,2);
			this.setLiveness(true,2,3);
			this.setLiveness(true,3,2);

		}
	}

	public void yourDesignOne() {
		clear();
		setLiveness(true, 15, 17);
		setLiveness(true, 15, 18);
		setLiveness(true, 15, 19);
		setLiveness(true, 15, 20);
		setLiveness(true, 15, 21);
		setLiveness(true, 15, 22);
		setLiveness(true, 15, 23);
		setLiveness(true, 15, 24);
		setLiveness(true, 15, 25);
		setLiveness(true, 15, 26);
		setLiveness(true, 15, 27);
		setLiveness(true, 15, 28);
		setLiveness(true, 15, 29);
		setLiveness(true, 15, 30);
		setLiveness(true, 16, 17);
		setLiveness(true, 16, 18);
		setLiveness(true, 16, 29);
		setLiveness(true, 16, 30);
		setLiveness(true, 17, 17);
		setLiveness(true, 17, 19);
		setLiveness(true, 17, 28);
		setLiveness(true, 17, 30);
		setLiveness(true, 18, 17);
		setLiveness(true, 18, 20);
		setLiveness(true, 18, 27);
		setLiveness(true, 18, 30);
		setLiveness(true, 19, 17);
		setLiveness(true, 19, 21);
		setLiveness(true, 19, 26);
		setLiveness(true, 19, 30);
		setLiveness(true, 20, 17);
		setLiveness(true, 20, 22);
		setLiveness(true, 20, 25);
		setLiveness(true, 20, 30);
		setLiveness(true, 21, 17);
		setLiveness(true, 21, 23);
		setLiveness(true, 21, 24);
		setLiveness(true, 21, 30);
		setLiveness(true, 22, 17);
		setLiveness(true, 22, 23);
		setLiveness(true, 22, 24);
		setLiveness(true, 22, 30);
		setLiveness(true, 23, 17);
		setLiveness(true, 23, 22);
		setLiveness(true, 23, 25);
		setLiveness(true, 23, 30);
		setLiveness(true, 24, 17);
		setLiveness(true, 24, 21);
		setLiveness(true, 24, 26);
		setLiveness(true, 24, 30);
		setLiveness(true, 25, 17);
		setLiveness(true, 25, 20);
		setLiveness(true, 25, 27);
		setLiveness(true, 25, 30);
		setLiveness(true, 26, 17);
		setLiveness(true, 26, 19);
		setLiveness(true, 26, 28);
		setLiveness(true, 26, 30);
		setLiveness(true, 27, 17);
		setLiveness(true, 27, 18);
		setLiveness(true, 27, 29);
		setLiveness(true, 27, 30);
		setLiveness(true, 28, 17);
		setLiveness(true, 28, 18);
		setLiveness(true, 28, 19);
		setLiveness(true, 28, 20);
		setLiveness(true, 28, 21);
		setLiveness(true, 28, 22);
		setLiveness(true, 28, 23);
		setLiveness(true, 28, 24);
		setLiveness(true, 28, 25);
		setLiveness(true, 28, 26);
		setLiveness(true, 28, 27);
		setLiveness(true, 28, 28);
		setLiveness(true, 28, 29);
		setLiveness(true, 28, 30);
	}

	public void yourDesignTwo() {
		clear();
		setLiveness(true, 6, 23);
		setLiveness(true, 6, 24);
		setLiveness(true, 7, 22);
		setLiveness(true, 7, 24);
		setLiveness(true, 8, 21);
		setLiveness(true, 8, 24);
		setLiveness(true, 8, 25);
		setLiveness(true, 9, 20);
		setLiveness(true, 9, 25);
		setLiveness(true, 10, 19);
		setLiveness(true, 10, 24);
		setLiveness(true, 10, 25);
		setLiveness(true, 11, 19);
		setLiveness(true, 11, 24);
		setLiveness(true, 12, 19);
		setLiveness(true, 12, 24);
		setLiveness(true, 13, 19);
		setLiveness(true, 13, 24);
		setLiveness(true, 13, 25);
		setLiveness(true, 14, 19);
		setLiveness(true, 14, 25);
		setLiveness(true, 15, 19);
		setLiveness(true, 15, 24);
		setLiveness(true, 15, 25);
		setLiveness(true, 16, 19);
		setLiveness(true, 16, 24);
		setLiveness(true, 17, 19);
		setLiveness(true, 17, 24);
		setLiveness(true, 18, 19);
		setLiveness(true, 18, 24);
		setLiveness(true, 18, 25);
		setLiveness(true, 19, 19);
		setLiveness(true, 19, 25);
		setLiveness(true, 20, 19);
		setLiveness(true, 20, 24);
		setLiveness(true, 20, 25);
		setLiveness(true, 21, 19);
		setLiveness(true, 21, 24);
		setLiveness(true, 22, 19);
		setLiveness(true, 22, 24);
		setLiveness(true, 23, 19);
		setLiveness(true, 23, 24);
		setLiveness(true, 23, 25);
		setLiveness(true, 24, 19);
		setLiveness(true, 24, 25);
		setLiveness(true, 25, 19);
		setLiveness(true, 25, 24);
		setLiveness(true, 25, 25);
		setLiveness(true, 26, 19);
		setLiveness(true, 26, 24);
		setLiveness(true, 27, 19);
		setLiveness(true, 27, 24);
		setLiveness(true, 28, 19);
		setLiveness(true, 28, 24);
		setLiveness(true, 28, 25);
		setLiveness(true, 29, 20);
		setLiveness(true, 29, 25);
		setLiveness(true, 30, 21);
		setLiveness(true, 30, 24);
		setLiveness(true, 30, 25);
		setLiveness(true, 31, 22);
		setLiveness(true, 31, 24);
		setLiveness(true, 32, 23);
		setLiveness(true, 32, 24);
	}


	public void logAndCapture() {
		System.out.println("Begin Log and Capture");
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				if (isAlive(i, j) == true) System.out.println("setLiveness(true, " + i + ", " + j + ");");
			}
		}
		System.out.println("End Log and Capture");
		System.out.println(" ");

	}

}