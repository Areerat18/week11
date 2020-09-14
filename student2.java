package week11;

public class student2 {
	int Number1;
	int Number2;
	String Name;
	public student2() {
		super();
		System.out.println("Over load");
	}
	public student2(int num1,int num2,String name) {
		this.Number1 = num1;
		this.Number2 = num2;
		this.Name = name;
	}
	public static void main(String[]args) {
		student2 std1 = new student2(20,50,"Lisa");
		student2 std2 = new student2();
		System.out.println("Default value of number1 is "+ std1.Number1);
		System.out.println("Default value of number2 is "+ std1.Number2);
		System.out.println("Default value of name is" + std1.Name);
	}
}
