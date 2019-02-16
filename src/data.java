import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class data extends JFrame {
	JFrame frame1;
	JLabel lblUserName;
	ArrayList<String> userInfo;
	String uName;
	String uPassword;
	String check="";

	public data() {
		frame1 = new JFrame();
		frame1.setTitle("Information");
		frame1.setBounds(500, 200, 379, 248);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);				
	}

	public void initialize() {
		
		JPanel panel = new JPanel();
		frame1.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(20, 25, 89, 25);
		panel.add(lblUserName);
		
		JTextField textField = new JTextField();
		textField.setBounds(110, 25, 210, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		lblUserName = new JLabel("Password");
		lblUserName.setBounds(20, 70, 89, 25);
		panel.add(lblUserName);
		
		JPasswordField passwordField1 = new JPasswordField();
		passwordField1.setBounds(110, 70, 210, 25);
		panel.add(passwordField1);
		
		lblUserName = new JLabel("Re_Password");
		lblUserName.setBounds(20, 115, 89, 25);
		panel.add(lblUserName);
		
		JPasswordField passwordField2 = new JPasswordField();
		passwordField2.setBounds(110, 115, 210, 25);
		panel.add(passwordField2);
	    
		JButton btnNewButton1 = new JButton("Create");
	    btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uName =textField.getText();
				System.out.println(uName);
				String password1 = new String(passwordField1.getPassword());
				System.out.println(password1);
				String password2 = new String(passwordField2.getPassword());
				System.out.println(password2);
				if(uName.equals(check)) {
					System.out.println("No User Name");
				}else if(password1.equals(check)||password2.equals(check)){
					System.out.println("No Password");
				}else if(password1.equals(password2)) {
					uPassword=password1;
					System.out.println("equal");
					popup p = new popup();
					p.initialize("User Created",50,15);
					frame1.dispose();
				}else {
					System.out.println("not equal");			
				}
				
			}
		});
		btnNewButton1.setBounds(230, 160, 89, 30);
		panel.add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Delete");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uName =textField.getText();
				System.out.println(uName);
				String password1 = new String(passwordField1.getPassword());
				System.out.println(password1);
				String password2 = new String(passwordField2.getPassword());
				System.out.println(password2);
				if(uName.equals(check)) {
					System.out.println("No User Name");
				}else if(password1.equals(check)||password2.equals(check)){
					System.out.println("No Password");
				}else if(password1.equals(password2)) {
					uPassword=password1;
					System.out.println("equal");
					popup p = new popup();
					p.initialize("User Removed",50,15);
					frame1.dispose();
				}else {
					System.out.println("not equal");			
				}
				
			}
		});
		btnNewButton2.setBounds(130, 160, 89, 30);
		panel.add(btnNewButton2);

	}

}
