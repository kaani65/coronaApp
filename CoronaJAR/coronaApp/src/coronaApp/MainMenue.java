package coronaApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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

public class MainMenue implements ActionListener {

	// private static JLabel userLabel;
	// private static JTextField userText;
	// private static JLabel passwordLabel;
	// private static JPasswordField passwordText;
	private static JButton newestNumbers;
	private static JButton staySafe;
	private static JLabel success;
	private static ImageIcon icon;

	public static final String IMG_PATH = "src/coronaApp/coronapic.png";

	public void mainMenue(JFrame frame, JPanel panel) {

		// URL iconURL = getClass().getResource("/coronaApp/coronapic.jpg");
		// ImageIcon icon = new ImageIcon (iconURL);
		// frame.setIconImage(icon.getImage());
		// panel.add(icon);

		/*try {
			BufferedImage img = ImageIO.read(new File(IMG_PATH));
			ImageIcon icon = new ImageIcon(img);
			JLabel label = new JLabel(icon);
			JOptionPane.showMessageDialog(null,label);

		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		newestNumbers = new JButton("Newst Numbers");
		newestNumbers.setBounds(100, 500, 80, 25);
		newestNumbers.setSize(202, 60);
		newestNumbers.addActionListener((ActionListener) new MainMenue());
		panel.add(newestNumbers);

		staySafe = new JButton("Stay Safe");
		staySafe.setBounds(100, 400, 80, 25);
		staySafe.setSize(202, 60);
		staySafe.addActionListener((ActionListener) new MainMenue());
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