package coronaApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenue implements ActionListener{

	// private static JLabel userLabel;
	// private static JTextField userText;
	// private static JLabel passwordLabel;
	// private static JPasswordField passwordText;
	private static JButton newestNumbers;
	private static JButton button2;
	private static JLabel success;

	public void mainMenue(JFrame frame, JPanel panel) {

		//URL iconURL = getClass().getResource("src/coronaApp/coronapic.jpg");
		//ImageIcon icon = new ImageIcon (iconURL);
		//frame.setIconImage(icon.getImage());
	
		newestNumbers = new JButton("Newst Numbers");
		newestNumbers.setBounds(100, 500, 80, 25);
		newestNumbers.setSize(202, 60);
		newestNumbers.addActionListener((ActionListener) new MainMenue());
		panel.add(newestNumbers);

		button2 = new JButton("Stay Safe");
		button2.setBounds(100, 400, 80, 25);
		button2.setSize(202, 60);
		button2.addActionListener((ActionListener) new MainMenue());
		panel.add(button2);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Desktop browser = Desktop.getDesktop();
		try{
		browser.browse(new URI("http://coronavirus.app"));
		}
		catch (IOException err) {
			
		}
		catch(URISyntaxException err){

		}

	}
}