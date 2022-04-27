package getoutofmyswamp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class Gameplay implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

	public static void main(String[] args) {
		
		menu();

	}
	//A menu method
	public static void menu() {
			
			String output, userNum;
			int num;
			
			do{
				//construct output
				output = "Select one of the menu options \n\n";
				output = output + "1 - New Game \n";
				output = output + "2 - Load Game \n";
				output = output + "3 - Settings \n";
				output = output + "4 - Instruction \n";
				output = output + "5 - Exit";
				
				//prompt user
				userNum = JOptionPane.showInputDialog(output);
				//convert to integer
				num = Integer.parseInt(userNum);
				
				switch(num) {
				case 1:
					output = "Game starting";
					//display output
					JOptionPane.showMessageDialog(null, output);
					startNewGame();
					break;
				case 2:
					output = "Do you want to load a previous game ?";
					//display output
					JOptionPane.showMessageDialog(null, output);
					loadGame();
					break;
					
				case 3:
					output = "Do you want change the ogre mood ?";
					//display output
					JOptionPane.showMessageDialog(null, output);
					changeSettings();
					break;
					
				case 4:
					output = "Instruction ";
					output = output + "Instructions about Hek ";
					//display output
					JOptionPane.showMessageDialog(null, output);
					break;
				default: 
					output = "Invalid input! Try another input ";
					JOptionPane.showMessageDialog(null, output);
				}
			}
				while (num!= 5);//end do/while loop
		}
	
	//save game using serialization
	public static void saveGame(Game theGame) {
		try {
			ObjectOutputStream os = new ObjectOutputStream (new FileOutputStream("GameData.save"));
			os.writeObject(theGame);
			os.close();
		}catch(IOException e) {
			System.out.println("IOException" + e);
		}
	}
	//method to load saved game using deserialization
	public static void loadGame() {
		Game theGame = null;
		try {
			ObjectInputStream os = new ObjectInputStream (new FileInputStream("GameData.save"));
			theGame = (Game) os.readObject();
			os.close();
		}catch(Exception e) {
			System.out.println("IOException" + e);
		}
		if(theGame.start()) {
			saveGame(theGame);
		}
		
	}//end loadGame
	//method to start new game
	public static void startNewGame() {
		Settings gameSettings = null;
		Game theGame;
		try {
			ObjectInputStream os = new ObjectInputStream(new FileInputStream("Settings.save"));
			gameSettings = (Settings) os.readObject();
			os.close();
			theGame = new Game (gameSettings.getGridOrder(), gameSettings.getNewEnemies());
			
		}catch(Exception e) {
			theGame = new Game();
		}
		if(theGame.start()) {
			saveGame(theGame);
		}
			
		
	}//end startNewGame
	//method to change game setting
	public static void changeSettings() {
		
		
	}//end changeSettings
	


		
	}



