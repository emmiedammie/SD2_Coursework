package getoutofmyswamp;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;



public class Getoutofmyswamp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\OneDrive - Tolaram\\Pictures\\Ogre.png");

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Getoutofmyswamp frame = new Getoutofmyswamp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Getoutofmyswamp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\OneDrive - Tolaram\\Pictures\\Ogre.png"));
		setTitle("Get Out of my Swamp!!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 669);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel game_pic = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent (Graphics g) {
				g.drawImage(image, 0, 0, this);
			}
		};
		game_pic.setBounds(273, 0, 363, 636);
		contentPane.add(game_pic);
		game_pic.setLayout(null);
		game_pic.repaint();
		
	}
}
