package getoutofmyswamp;

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
	//method to change game setting
	private static void changeSettings() {
		
		
	}//end changeSettings
	//method to load saved game
	private static void loadGame() {
		
		
	}//end loadGame
	//method to start new game
	private static void startNewGame() {
		
		
	}//end startNewGame

		
	}



