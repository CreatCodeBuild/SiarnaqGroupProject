package sixesWildBoundary;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class GameOverApplication extends JFrame {
	JButton btnMainMenu ; 
	
	public GameOverApplication() {
		getContentPane().setLayout(null);
		setBounds(300, 200, 350, 200);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 314, 92);
		getContentPane().add(lblNewLabel);
		
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setBounds(120, 127, 89, 23);
		getContentPane().add(btnMainMenu);
	}
	
	public JButton getMainMenuBtn(){
		return btnMainMenu ;
	}
}
