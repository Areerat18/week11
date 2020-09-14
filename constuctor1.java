package week11;

public class constuctor1 {
		int age = 5;
		String size;
		String bread = "Persian";
		public constuctor1() {
			System.out.println("My cat is age :"+ age);
			System.out.println("My cat is bread :" + bread);
		}
		void method() {
			System.out.println("My cat is size : " + size);
		}
		void method2() {
			
		}
		public static void maim(String[]args) {
			String size = "Big";
			constuctor1 cat1 = new constuctor1();
			constuctor1 cat2 = new constuctor1();
			cat2.size = "Small";
			cat2.method();
		}
	}

