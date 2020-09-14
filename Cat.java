package week11;

public class Cat {
	String breed;
	String size;
	String color;
	String name;
	int age;
	
	void print() {
		System.out.println("breed: " + breed);
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
		System.out.println("Age: " + age);
	}
	
	void name() {
		System.out.println("Name is : " + name);
	}
	
	public static void main(String[]args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.name = "Platu";
		cat1.name();
		cat1.breed = "Persian";
		cat1.size = "Large";
		cat1.color = "white black";
		cat1.age = 5;
		cat1.print();
		System.out.println("=============");
		cat2.name = "Gege";
		cat2.name();
		cat2.breed = "Siamese";
		cat2.size = "Small";
		cat2.color = "white Gray";
		cat2.age = 3;
		cat2.print();
	}
	
}
