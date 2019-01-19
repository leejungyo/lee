package diary;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

public class DiaryContents extends JFrame {
	private JTextField ID;
	private JTextField PW;
	private JTextField noText;
	private JTextField titleText;

	public DiaryContents() {
		getContentPane().setBackground(Color.ORANGE);
		setBackground(Color.PINK);
		getContentPane().setForeground(Color.WHITE);
		setTitle("나의 일기장 세부내용");
		setSize(423, 654);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel lblNewLabel = new JLabel("나의 일기장");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("----------------------");
		label.setFont(new Font("굴림", Font.PLAIN, 27));
		getContentPane().add(label);

		JLabel no = new JLabel("번호");
		no.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(no);

		noText = new JTextField();
		noText.setBackground(Color.WHITE);
		noText.setForeground(Color.RED);
		getContentPane().add(noText);
		noText.setColumns(34);

		JLabel lblNewLabel_1 = new JLabel("제목");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(lblNewLabel_1);

		titleText = new JTextField();
		getContentPane().add(titleText);
		titleText.setColumns(34);

		JLabel label_1 = new JLabel("내용");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(label_1);

		
		JTextArea contentText = new JTextArea();
		contentText.setRows(5);
		contentText.setTabSize(12);
		contentText.setColumns(36);
		contentText.setFont(new Font("Monospaced", Font.BOLD, 18));
		getContentPane().add(contentText);
		
		JButton btnNewButton = new JButton("일기읽기");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
				
				try {
					FileReader F2 = new FileReader("C:/diary/" + noT + ".txt");
					BufferedReader reader = new BufferedReader(F2);
					String noR = reader.readLine();
					String titleR = reader.readLine();
					String contentR = reader.readLine();
					
					noText.setText(noR);
					titleText.setText(titleR);
					contentText.setText(contentR);
					
					
					
					
					
					
					JOptionPane.showMessageDialog(null, "파일로 읽기 성공!!!!");
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "파일로 읽기 실패!!!!");
				}
				
				

			}
		});

		JButton save = new JButton("일기저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();

				try {

					FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
					f.write(noT + "\r\n");
					f.write(titleT + " \r\n");
					f.write(contentT + "\r\n");
					f.flush();
					f.close();

					noText.setText("");
					titleText.setText("");
					contentText.setText("");

					JOptionPane.showMessageDialog(null, "파일로 저장 성공!!!!");
				} catch (Exception e1) {

					JOptionPane.showMessageDialog(null, "파일로 저장  오류!!!!");
				}
			}
		});

		save.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		getContentPane().add(save);
		getContentPane().add(btnNewButton);

		setVisible(true);

	}

	public static void main(String[] args) {
		new DiaryContents();
	}

}