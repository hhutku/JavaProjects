package com.sprintqa.java.class24;
class Animal{
	public void eat() {
		System.out.println("Eating...");
	}}
class Dog extends Animal{
	public void bark() {
		System.out.println("Barking......");
	}
	public void weep() {
	}}
class BabyDog extends Dog{
	public void weep() {
		System.out.println("weepping....");
<<<<<<< HEAD
	}}
=======
	}
}
>>>>>>> 23578954362b5b2f999659cae48d5339b6b904f1
public class MultiLevelInheritance {
	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.eat();
		b.bark();
		b.weep();
<<<<<<< HEAD
<<<<<<< HEAD
		Dog d = new Dog();
<<<<<<< HEAD
		d.weep();
		}}
=======
=======
				
>>>>>>> 23578954362b5b2f999659cae48d5339b6b904f1
=======
		
<<<<<<< HEAD
		//Dog d = new Dog();
		//d.weep();
=======
		Dog d = new Dog();
>>>>>>> d4083a441fec3acd3af3029e4fb48467d88a1639
>>>>>>> 57019a0573106c57dfe5c71569a6277e4f29cd4c
		
>>>>>>> d4083a441fec3acd3af3029e4fb48467d88a1639
	}

}
>>>>>>> e091283f91a447cefc59a868718fa7d6180b7b94
