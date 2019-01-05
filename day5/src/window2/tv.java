package window2;

public class tv {

	// 정적특징(상태) --> 변수

	String shape;
	Boolean stand;
	
	// 동적특징(동작) --> 메소드
	public void change(int ch) {
		System.out.println(ch + "번호로 채널 변경하다.");
	}
		public void turnOn() {
		System.out.println("TV를 켜다");
		
	}
}


