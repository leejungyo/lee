package window2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class Pizza {
	JFrame f; 
    JLabel top , count;
    JButton b1,b2,b3;
    JTextField total;
    int sum = 0;
    int combo = 0;
    int potato = 0;
    int bulgoki= 0;
    
    JTextArea list;
    private JLabel lblNewLabel;
    private JButton btnNewButton;
    
    public Pizza() {
    	
		f = new JFrame();
		f.setSize(350, 300);
		
		top = new JLabel("<<<�ڹ� ���ڿ� ���� ���� ȯ���մϴ�.�ݰ����ϴ�>>>");
		count = new JLabel("����");
		b1 = new JButton("�޺�����");
		b1.setBackground(Color.YELLOW);
		b2 = new JButton("������������");
		b3 = new JButton("�Ұ������");
		total = new JTextField(20);
		
		FlowLayout flow = new FlowLayout();
	    f.getContentPane().setLayout(flow);
	    list = new JTextArea(3, 30);
	    
	    f.getContentPane().add(top);
	    f.getContentPane().add(b1);
	    f.getContentPane().add(b2);
	    f.getContentPane().add(b3);
	    f.getContentPane().add(count);
	    f.getContentPane().add(total);
	    f.getContentPane().add(list);
	    
	    btnNewButton = new JButton("\uB204\uB974\uC138\uC694");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	JOptionPane.showMessageDialog(null, "���� ���� �����̱���");
	    	
	    	}
	    });
	    
	    lblNewLabel = new JLabel("\uCD1D\uACC4");
	    lblNewLabel.setBackground(Color.RED);
	    lblNewLabel.setForeground(Color.RED);
	    f.getContentPane().add(lblNewLabel);
	    f.getContentPane().add(btnNewButton);
	    
	    b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			sum++;
			total.setText(sum+"");
			combo++;
			list.setText("�޺� ����: " + combo + "��\n"
					+ "�������� ����:" + potato + "��\n"
					+ "�Ұ�� ����:" + bulgoki + "��\n");
			
			}
		});
	    b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				potato++;
				list.setText("�޺� ����: " + combo + "��\n"
						+ "�������� ����:" + potato + "��\n"
						+ "�Ұ�� ����:" + bulgoki + "��\n");
			}
		});
	    b3.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		sum++;
	    		total.setText(sum+"");
	    		bulgoki++;
	    		list.setText("�޺� ����: " + combo + "��\n"
						+ "�������� ����:" + potato + "��\n"
						+ "�Ұ�� ����:" + bulgoki + "��\n");
	    	}
	    });
	    
		f.setVisible(true);
				
	}
	public static void main(String[] args) {
		Pizza p = new Pizza();

	}

}
