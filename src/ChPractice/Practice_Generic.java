package ChPractice;

import java.util.*;

class LandAnimal
{
	public void crying() {System.out.println("육지동물");}
}

class Cat extends LandAnimal
{
	public void crying() {System.out.println("야옹야옹");}
}

class Dog extends LandAnimal
{
	public void crying() {System.out.println("왈왈멍멍");}
}

class Tiger extends LandAnimal
{
	public void crying() {System.out.println("어흥");}
}

class Sparrow
{
	public void crying() {System.out.println("짹짹");}
}

class AnimalList<T>
{
	ArrayList<T> al = new ArrayList<T>();
	
	void add(T animal) {al.add(animal);}
	T get(int index) {return al.get(index);}
	boolean remove(T animal) {return al.remove(animal);}
	int size() {return al.size();}
}

public class Practice_Generic {

	public static void main(String[] args) {
		AnimalList<LandAnimal> landAnimal = new AnimalList<>();
		landAnimal.add(new LandAnimal());
		landAnimal.add(new Cat());
		landAnimal.add(new Dog());
		landAnimal.add(new Tiger());
		
		for(int i = 0; i < landAnimal.size(); i++)
		{
			landAnimal.get(i).crying();
		}
	}

}
