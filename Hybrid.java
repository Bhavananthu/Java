package inheritance;


interface Mammal {
 void eat();
}


interface Bird {
 void fly();
}


class Animal {
 void sleep() {
     System.out.println("Animal is sleeping");
 }
}


class Dog extends Animal implements Mammal, Bird {


 public void eat() {
     System.out.println("Dog is eating");
 }


 public void fly() {
     System.out.println("Dog cannot fly");
 }
}



public class Hybrid {

	public static void main(String[] args) {
		
		 Dog dog = new Dog();
	     dog.sleep(); 
	     dog.eat(); 
	     dog.fly(); 
	}

}
