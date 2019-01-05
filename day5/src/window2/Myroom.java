package window2;

public class Myroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog dog = new Dog();
               
        dog.leg = 4;
        dog.tail = true;
        
        dog.bark();
        dog.shake();
        
        System.out.println(dog.leg);
        System.out.println(dog.tail);
        System.out.println("-----------------------");
        
        tv tv1 = new tv();
        tv1.shape = "네모";
        tv1.stand = true;
        
        tv1.turnOn();
        tv1.change(100);
        
        tv tv2 = new tv();
        tv2.shape = "다이아몬드";
        tv2.stand = false;
                
        tv2.turnOn();
        tv2.change(200);
        
        System.out.println("--------------");
        System.out.println(tv1);
        System.out.println(tv2);
                		
	}

}

