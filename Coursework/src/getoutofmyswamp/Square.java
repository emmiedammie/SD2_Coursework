package getoutofmyswamp;

import java.util.ArrayList;

public class Square {

	private int number;
	private Ship theShip;
	Ogre theOgre;
	ArrayList <OgreEnemy> theEnemies  = new ArrayList <OgreEnemy>();
	
	public Square(int number) {
		setNumber(number);
	}
	
	public boolean isThereAShip() {
		if(theShip == null) {
			return false;
		}
		return true;
	}
	
	
	//getters and setters
	public void setShip(Ship theShip) {
		this.theShip = theShip;
	}
	
	public void sinkShip(Ship theShip) {
		this.theShip = null;
	}
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}

	public Ogre getTheOgre() {
		return theOgre;
	}

	public void setTheOgre(Ogre theOgre) {
		this.theOgre = theOgre;
	}
	
}//end class
