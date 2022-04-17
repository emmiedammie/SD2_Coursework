package getoutofmyswamp;

import java.util.ArrayList;

public class Row {
	
	private ArrayList <Square> theSquares = new ArrayList <Square> ();
	private int number;
	private final int ROW_SIZE = 4;
	
	
	public Row(int number) {
		Square tempSquare;
		for(int loop = 1; loop <= this.ROW_SIZE; loop++) {
			tempSquare = new Square(loop);
			this.theSquares.add(tempSquare);
		}
		setNumber(number);
	}
	
	
	
	
	//getters and setters
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	
	public ArrayList <Square> getTheSquares () {
		return this.theSquares;
	}

}//end class
