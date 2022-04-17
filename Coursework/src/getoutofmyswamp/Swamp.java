package getoutofmyswamp;

import java.util.ArrayList;


public class Swamp {
	
	private ArrayList <Row> theRows = new ArrayList <Row> ();
	private final int NUMBER_OF_ROWS = 4;
	
	
	//Setting up the Grid using Rows
	public Swamp() {
		for(int loop = 1; loop <= this.NUMBER_OF_ROWS; loop++) {
			this.theRows.add(new Row(loop));
		}
		
		
	}//end Grid
	
	//is there a enemy on a particular square
	public boolean isTheOgreOn(int row, int square) {
		for(Row tempRow : this.theRows) {
			if(tempRow.getNumber() == row) {
				//found the correct row
				for(Square tempSquare : tempRow.getTheSquares()) {
					if(tempSquare.getNumber() == square) {
						//found the correct square
						if(tempSquare.getTheOgre() == null) {
							//the Ogre is not here
							return false;
						}
					}
				}
			}
			
		}
		return true;
	}//end class
	
	
	//method for number of enemies on a square
	public int howManyOgreEnemiesOn(int row, int square) {
		for(Row tempRow : this.theRows) {
			if(tempRow.getNumber() == row) {
				//found correct row
				for(Square tempSquare : tempRow.getTheSquares()) {
					if(tempSquare.getNumber() == square) {
						//found correct square
						return tempSquare.getTheEnemies().size();
					}
				}
			}
		}
		return 0;
	}
//end of how many ogre enemies
	
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
