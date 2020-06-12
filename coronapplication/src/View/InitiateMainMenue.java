package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InitiateMainMenue implements ActionListener {

	// private static JLabel userLabel;
	// private static JTextField userText;
	// private static JLabel passwordLabel;
	// private static JPasswordField passwordText;
	private static JButton newestNumbers;
	private static JButton staySafe;
	private static JLabel success;
	private static ImageIcon icon;
	private static JTextField coronaSearchfield;
	private static JButton coronaSearchButton;

	//public static final String IMG_PATH = "src/coronaApp/coronapic.png";

	public void mainMenue(JFrame frame, JPanel panel) {

		ImageIcon icon = new ImageIcon("/Users/drs-0507-u/eclipse-workspace/coronapplication/src/images/coronapic.jpg");
		JButton coronapic = new JButton("", icon);
		
	
		coronapic.setContentAreaFilled(false);
		coronapic.setBounds(90, 30, 200, 200);
		panel.add(coronapic);
		
		coronaSearchfield = new JTextField();
		coronaSearchfield.setBounds(110, 250, 150, 30);
		panel.add(coronaSearchfield);
		
		coronaSearchButton = new JButton("Corona Search");
		coronaSearchButton.setBounds(80, 300, 80, 25);
		coronaSearchButton.setSize(202,60);
		panel.add(coronaSearchButton);
		
		newestNumbers = new JButton("Newst Numbers");
		newestNumbers.setBounds(80, 500, 80, 25);
		newestNumbers.setSize(202, 60);
		newestNumbers.addActionListener((ActionListener) new InitiateMainMenue());
		panel.add(newestNumbers);

		staySafe = new JButton("Stay Safe");
		staySafe.setBounds(80, 400, 80, 25);
		staySafe.setSize(202, 60);
		staySafe.addActionListener((ActionListener) new InitiateMainMenue());
		panel.add(staySafe);

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Desktop browser = Desktop.getDesktop();
		if (e.getSource() == newestNumbers) {
			try {
				browser.browse(new URI("http://coronavirus.app"));
			} catch (IOException err) {

			} catch (URISyntaxException err) {

			}

		}
		if (e.getSource() == staySafe) {
			try {
				browser.browse(new URI("https://www.rki.de/DE/Content/InfAZ/N/Neuartiges_Coronavirus/nCoV.html"));
			} catch (IOException err) {

			} catch (URISyntaxException err) {

			}
		}
	}
}