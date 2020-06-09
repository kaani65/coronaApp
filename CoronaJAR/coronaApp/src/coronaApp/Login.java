package coronaApp;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login{
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	public void login(JFrame frame, JPanel panel, MainMenue mMenue) {
	
		userLabel = new JLabel("User");
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e) {
				String user = userText.getText();
				String password = passwordText.getText();
				
				System.out.println(user + "," + password);
				
				if(user.equals("test") && password.equals("test")) {
					success.setText("Welcome " + user);
					panel.removeAll();
					frame.setVisible(false);
					mMenue.mainMenue(frame, panel);
				}else {
					success.setText("Invalid Username or Password");
				}
			}
		});
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
	}


	
	// @Override
	// public void actionPerformed(ActionEvent e) {
	// 	// TODO Auto-generated method stub
		
		// String user = userText.getText();
		// String password = passwordText.getText();
		
		// System.out.println(user + "," + password);
		
		// if(user.equals("Testuser") && password.equals("testpassword")) {
		// 	success.setText("Welcome " + user);
		// 	loginSuccess = true;
		// 	System.out.println(loginSuccess);
		// }else {
		// 	success.setText("Invalid Username or Password");
		// 	loginSuccess = false;
		// }
		
		
	// }

}

