package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Laundry {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtDdmmyyyy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Laundry window = new Laundry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Laundry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("LAUNDARY APPLICATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("ID nos.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Cloth Count");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_4 = new JLabel("Detail");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JTextArea textArea = new JTextArea();
		
		JButton btnNewButton = new JButton("Recieved");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField.getText());
				String name = textField_1.getText();
				int count = Integer.parseInt(textField_2.getText());
				String date = txtDdmmyyyy.getText();
				int rd =Integer.parseInt(date.substring(0, 2)) +4 ;
				int d=Integer.parseInt(date.substring(2));
				int m =(Integer.parseInt(date.substring(2)))/100;
				int y= d % 10;
				if(rd>30) {
					rd = rd-30;
					if(m>12) {
						m=m-12;
						y=y+1;
					}
					else {
						m=m+1;
					}
				}
				textArea.append("Student: "+name+"\n"+" ID: "+id+"\n"+"Please recieve your cloths back on: "+rd+"-"+m+"-"+y+"\n"+"Number of clothes: "+count);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
		txtDdmmyyyy.setText("DDMMYY");
		txtDdmmyyyy.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addGap(30))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
							.addGap(27)))
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_2, Alignment.LEADING)
								.addComponent(textField, Alignment.LEADING)
								.addComponent(textField_1)
								.addComponent(txtDdmmyyyy))
							.addGap(102)
							.addComponent(btnNewButton)))
					.addGap(68))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(95)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(348, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(txtDdmmyyyy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
