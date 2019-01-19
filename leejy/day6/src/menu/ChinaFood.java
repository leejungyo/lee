package menu;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
//ctrl + shift + o(영문)

public class ChinaFood extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	int count = 0;
	final int price = 5000;
	JLabel lblNewLabel;

	public ChinaFood() {
		
		JButton btnNewButton = new JButton("짜장면");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				
				ImageIcon icon3= new ImageIcon("짜장면.jpg");
				lblNewLabel.setIcon(icon3);
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		getContentPane().add(btnNewButton, BorderLayout.NORTH);
		getContentPane().setBackground(Color.ORANGE);
		setSize(700, 550);
		setTitle("주문하세요");
	
		ImageIcon icon = new ImageIcon("중국집.png");
		
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		
		JButton button = new JButton("우동");
		button.setFont(new Font("굴림", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count++;
			textField.setText(count+"");
			textField_1.setText(count*price+"");
			ImageIcon icon2= new ImageIcon("우동.png");
			lblNewLabel.setIcon(icon2);
		}
		});
		
		button.setForeground(Color.MAGENTA);
		getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("짬뽕");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				textField.setText(count+"");
				textField_1.setText(count*price+"");
				ImageIcon icon3= new ImageIcon("짬뽕.jpg");
				lblNewLabel.setIcon(icon3);
						}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1.setForeground(Color.MAGENTA);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("개수");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.BLACK);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 15));
		getContentPane().add(textField);
		textField.setColumns(15);
		
		JLabel label = new JLabel("금액");
		label.setFont(new Font("굴림", Font.PLAIN, 15));
		getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 15));
		getContentPane().add(textField_1);
		textField_1.setColumns(15);
		
			
	 
		lblNewLabel = new JLabel("");
	 	getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(icon);
		
		setVisible(true);
		
		}
		public static void main(String[] args) {
			new ChinaFood();
		}
}
