
package coronaApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class main {


	public void clearPage(JPanel panel){
		panel.removeAll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		MainMenue mMenue =  new MainMenue();
		Login alogin = new Login();
		JLabel label = new JLabel();
		
		
		
		frame.setSize(375, 667);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		alogin.login(frame, panel, mMenue);
		
		// mMenue.mainMenue(frame, panel);
		
	}


}
