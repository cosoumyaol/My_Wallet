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

public class info extends JFrame {
	JFrame frame2;
	public info() {
		frame2 = new JFrame();
		frame2.setTitle("Information");
		frame2.setBounds(500, 200, 396, 420);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
	}

	public void initialize() {
		
		JPanel panel = new JPanel();
		frame2.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		    
		JButton btnNewButton = new JButton("Close");
	    btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
			}
		});
		btnNewButton.setBounds(137, 348, 89, 23);
		panel.add(btnNewButton);
		
		JTable table = new JTable();
		table.setBounds(10, 11, 360, 326);
		panel.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(353, 11, 17, 326);
		panel.add(scrollBar);
		
	}

}
