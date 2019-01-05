package window2;

import java.util.Scanner;

public class MyShop3 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		System.out.print("숫자1:   ");
		int input1 = sc.nextInt();
		System.out.print("숫자2:   ");
		int input2 = sc.nextInt();
		
		
		Cal2 cal2 = new Cal2();
		int sum = cal2.myCal(input1, input2);
		
		System.out.print("최종결과값은:    " + (sum*100));
		
		}
		}
		
		

		
	

