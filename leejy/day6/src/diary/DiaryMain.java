package diary;

import java.awt.FlowLayout;

import javax.print.DocFlavor.STRING;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiaryMain extends JFrame {
	private JTextField ID;
	private JTextField PW;

	public DiaryMain() {
		getContentPane().setBackground(Color.PINK);
		// ctrl+shift +f

		setTitle("나의 일기장 시작화면");
		setSize(250, 498);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);

		ImageIcon icon = new ImageIcon("두기하우저일기장.jpg");
		lblNewLabel.setIcon(icon);

		JLabel lblNewLabel_1 = new JLabel("아이디:");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		getContentPane().add(lblNewLabel_1);

		ID = new JTextField();
		ID.setFont(new Font("굴림", Font.PLAIN, 15));
		getContentPane().add(ID);
		ID.setColumns(20);

		JLabel lblNewLabel_2 = new JLabel("패스워드:");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		getContentPane().add(lblNewLabel_2);

		PW = new JTextField();
		PW.setFont(new Font("굴림", Font.PLAIN, 15));
		getContentPane().add(PW);
		PW.setColumns(20);

		JButton LOGIN = new JButton("로그인");
		LOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sID = "root";
				String sPW = "1234";
				String gID = ID.getText();
				String gPW = PW.getText();

				if ((sID.equals(gID)) && (sPW.equals(gPW))) {
					JOptionPane.showMessageDialog(null, "로그인 OK입니다.");
					DiaryContents name = new DiaryContents();
					
					
					
					

				} else {
					JOptionPane.showMessageDialog(null, "로그인 NOT입니다. 재입력해주세요");
				}

			}
		});
		LOGIN.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		getContentPane().add(LOGIN);

		JButton reset = new JButton("초기화");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ID.setText("");
				PW.setText("");

			}
		});
		reset.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		getContentPane().add(reset);

		setVisible(true);

	}

	public static void main(String[] args) {
		DiaryMain name = new DiaryMain();

	}

}
