package javaswing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame{
	
	ImageIcon icon = new ImageIcon("house.png");
	ImageIcon Bgicon = new ImageIcon(new ImageIcon("butterfly.jpg").getImage().getScaledInstance(380, 450, Image.SCALE_SMOOTH));
	
	private static final Color Color = null;
	JTextField txtNum1 = new JTextField();
	JTextField txtNum2 = new JTextField();
	JTextField txtNum3 = new JTextField();
	
	JLabel lbltxtNum1 = new JLabel();
	JLabel lbltxtNum2 = new JLabel();
	JLabel lbltxtNum3 = new JLabel();
		
	JButton add =new JButton();

	
	Frame(){
		
		this.setSize(380, 450);
		this.setLocationRelativeTo(null);
		this.setTitle("Java Swing");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.decode("#34b7eb"));
		this.setIconImage(icon.getImage());
		this.setContentPane(new JLabel(Bgicon));
		
		txtNum1.setBounds(150, 50, 150, 30);
		txtNum2.setBounds(150, 90, 150, 30);
		txtNum3.setBounds(150, 130, 150, 30);
		
		lbltxtNum1.setBounds(30, 50, 150, 30);
		lbltxtNum1.setText("Enter number 1");
		lbltxtNum1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		//lbltxtNum1.setBorder(BorderFactory.createLineBorder(Color.red));
		lbltxtNum2.setBounds(30, 90, 150, 30);
		lbltxtNum2.setText("Enter number 2");
		lbltxtNum2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		//lbltxtNum2.setBorder(BorderFactory.createLineBorder(Color.red));
		lbltxtNum3.setBounds(30, 130, 150, 30);
		lbltxtNum3.setText("The sum; ");
		lbltxtNum3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		//lbltxtNum3.setBorder(BorderFactory.createLineBorder(Color.red));
		 
		add.setBounds(150, 170, 150, 30);
		add.setText("ADD");
		add.setFocusable(false);
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				int sum = num1 + num2;
				
				txtNum3.setText(String.valueOf(sum));
				
				
			}});
		
		
		this.add(txtNum1);
		this.add(txtNum2);
		this.add(txtNum3);
		this.add(lbltxtNum1);
		this.add(lbltxtNum2);
		this.add(lbltxtNum3);
		this.add(add);
		
		this.setLayout(null);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.decode("#34b7eb"));
		
	}
		
}

