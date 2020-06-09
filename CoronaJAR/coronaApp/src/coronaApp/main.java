
package coronaApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
		
		frame.setSize(375, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		alogin.login(frame, panel, mMenue);
		
		// mMenue.mainMenue(frame, panel);
		
	}

}
