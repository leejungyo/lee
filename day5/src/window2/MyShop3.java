package window2;

import java.util.Scanner;

public class MyShop3 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		System.out.print("����1:   ");
		int input1 = sc.nextInt();
		System.out.print("����2:   ");
		int input2 = sc.nextInt();
		
		
		Cal2 cal2 = new Cal2();
		int sum = cal2.myCal(input1, input2);
		
		System.out.print("�����������:    " + (sum*100));
		
		}
		}
		
		

		
	

