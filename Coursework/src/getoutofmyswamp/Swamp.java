package getoutofmyswamp;

import java.util.ArrayList;


public class Swamp {
	
	private ArrayList <Row> theRows = new ArrayList <Row> ();
	private final int SWAMP_SIZE = 4;
	
	
	//Setting up the Grid using Rows
	public Swamp() {
		Row tempRow;
		for(int loop = 1; loop <= this.SWAMP_SIZE; loop++) {
			tempRow = new Row(loop);
			this.theRows.add(tempRow);
		}
		
		
	}//end Grid
	
	//is there a ship on a particular square
	public boolean isThereAShipOn(int row, int square) {
		for(Row tempRow : this.theRows) {
			if(tempRow.getNumber() == row) {
				//found the correct row
				for(Square tempSquare : tempRow.getTheSquares()) {
					if(tempSquare.getNumber() == square) {
						//found the correct square
						return tempSquare.isThereAShip();
					}
				}
			}
			
		}
		return false;
	}//end of isThereASHipOn
	
	
	//method to add ship
	public void addShip(Ship ship, int row, int square) {
		for(Row tempRow : this.theRows) {
			if(tempRow.getNumber() == row) {
				//found correct row
				for(Square tempSquare : tempRow.getTheSquares()) {
					if(tempSquare.getNumber() == square) {
						//found correct square
						tempSquare.setShip(ship);
					}
				}
			}
		}
	}//end of addShip
	
	//method to remove an already hit ship
	public void removeShip(Ship ship, int row, int square) {
		for(Row tempRow : this.theRows) {
			if(tempRow.getNumber() == row) {
				//found correct row
				for(Square tempSquare : tempRow.getTheSquares()) {
					if(tempSquare.getNumber() == square) {
						//found correct square
						tempSquare.sinkShip(ship);
					}
				}
			}
		}
	}//end of remove ship
	
	
	
}//end class
