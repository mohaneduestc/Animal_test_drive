
import java.util.*;
public class AnimalTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyAnimalList list = new MyAnimalList();
		Dog a = new Dog();
		Cat c = new Cat();
		
		list.add(a);
		list.add(c);
		
		if (a.equals(c))
			System.out.println("True");
		else{
			System.out.println("False");
		}
		System.out.println("c is in "+ c.getClass());
		System.out.println("The hashCode of c is " + c.hashCode());	
		System.out.println("The hashCode of a is " + a.hashCode());
		System.out.println(a.toString());
	
		ArrayList<Object> myDogArrLis = new ArrayList<Object>();
		Dog aDog = new Dog();
		Cat aCat = new Cat();
		
		myDogArrLis.add(aDog);
		myDogArrLis.add(aDog);
		
		myDogArrLis.add(aCat);
		
		Object d = myDogArrLis.get(0);
		if(d instanceof Dog){
			Dog q = (Dog)d;
			q.sleep();
		}
//		System.out.println(d);
//		
//		Dog dd = myDogArrLis.get(1);
//		System.out.println(dd);
	
	
	}
	

}
