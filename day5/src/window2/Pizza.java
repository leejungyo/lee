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
		
		top = new JLabel("<<<자바 피자에 오신 것을 환영합니다.반갑습니다>>>");
		count = new JLabel("개수");
		b1 = new JButton("콤보피자");
		b1.setBackground(Color.YELLOW);
		b2 = new JButton("포테이토피자");
		b3 = new JButton("불고기피자");
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
	    	JOptionPane.showMessageDialog(null, "나를 정말 누르셨군요");
	    	
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
			list.setText("콤보 개수: " + combo + "개\n"
					+ "포테이토 개수:" + potato + "개\n"
					+ "불고기 개수:" + bulgoki + "개\n");
			
			}
		});
	    b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum+"");
				potato++;
				list.setText("콤보 개수: " + combo + "개\n"
						+ "포테이토 개수:" + potato + "개\n"
						+ "불고기 개수:" + bulgoki + "개\n");
			}
		});
	    b3.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		sum++;
	    		total.setText(sum+"");
	    		bulgoki++;
	    		list.setText("콤보 개수: " + combo + "개\n"
						+ "포테이토 개수:" + potato + "개\n"
						+ "불고기 개수:" + bulgoki + "개\n");
	    	}
	    });
	    
		f.setVisible(true);
				
	}
	public static void main(String[] args) {
		Pizza p = new Pizza();

	}

}
