/**
 * 
 */
package getoutofmyswamp;

import java.io.Serializable;

/**character properties:: Character properties & behaviours
 * @author Damilola
 *
 */

public class CharacterProperties implements Serializable {
	private String name;
	private int row,col, bounds;
	//constructor for ogreenemies since they enter at (0,0)
	public CharacterProperties(String name, int bounds) {
		this.name = name;
		this.row = 0;
		this.col = 0;
		this.bounds = bounds;
		
	}
	//constructor for ogre which starts at any location except (0,0)
	public CharacterProperties(String name, int row, int col, int bounds) {
		this.name = name;
		this.row = row;
		this.col = col;
		this.bounds = bounds;
				
	}
	//toString method
	public String toString() {
		return (name + "at (" + row + "," + col + ")\t");
		
	}
	//method for character movements
	//method returns true if movement possible else returns false
	public boolean moveNorth() {
		if((row-1) >= 0) {
			row--;
			return true;
		
		}else 
			return false;
	}
	public boolean moveSouth() {
		if((row+1) < bounds) {
			row++;
			return true;
		}else 
			return false;
	}
	public boolean moveWest() {
		if((col-1) >= 0) {
			col--;
			return true;
		}else 
			return false;
	}
	public boolean moveEast() {
		if((col+1) < bounds) {
			col++;
			return true;
		}else 
			return false;
	}
	public boolean moveNorthEast() {
		if((col+1)< bounds && (row-1) >=0) {
			col++;
			row--;
			return true;
		}else
			return false;
	}
	public boolean moveSouthEast() {
		if((col+1) < bounds && (row+1) < bounds) {
			col++;
			row++;
			return true;
		}else 
			return false;
	}
	public boolean moveSouthWest() {
		if((col-1) >= 0 && (row+1) < bounds) {
			col--;
			row++;
			return true;
		}else 
			return false;
	}
	public boolean moveNorthWest() {
		if((col-1) >=0 && (row-1) >= 0) {
			col--;
			row--;
			return true;
		}else
			return false;
	}
	//checking if characters are on same position
	public boolean equals(CharacterProperties c) {
		if((row==c.row) && (col==c.col)) {
			return true;
		
		}
		else
			return false;
			
	}
}
