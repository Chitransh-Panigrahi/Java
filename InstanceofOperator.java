package csw;
class Animal {
	public void makeSound() {
		System.out.println("Animal makesound method");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dog makesound method");
	}
}

public class InstanceofOperator {
	public static void main(String args[]){
		 Animal a = new Animal();
		 Dog d = new Dog();
		 if(a instanceof Animal){
		 System.out.println("a is a type of Animal");
		 }else{
		 System.out.println("a is NOT a type of Animal");
		 }
		 if(a instanceof Dog){
		 System.out.println("a is a type of Dog");
		 }else{
		 System.out.println("a is NOT a type of Dog");
		 }
		 if(d instanceof Animal){
		 System.out.println("d is a type of Animal");
		 }else{
		 System.out.println("d is NOT a type of Animal");
		 }
		 if(d instanceof Dog){
		 System.out.println("d is a type of Dog");
		 }else{
		 System.out.println("d is NOT a type of Dog");
		 }
		}
}
