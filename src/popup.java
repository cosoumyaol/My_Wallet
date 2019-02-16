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
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class popup extends JFrame {
	JFrame frame3;
	public popup() {
		frame3 = new JFrame();
		frame3.setTitle("Information");
		frame3.setBounds(600, 300, 200, 120);
		frame3.setVisible(true);
		frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
	}

	public void initialize(String q,int a,int b) {
		
		JPanel panel = new JPanel();
		frame3.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		    
		JButton btnNewButton = new JButton("Ok");
	    btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
			}
		});
		btnNewButton.setBounds(65, 50, 50, 23);
		panel.add(btnNewButton);
		
		JLabel lblUserName = new JLabel(q);
		lblUserName.setBounds(a,b, 89, 23);
		panel.add(lblUserName);
		
	}

}