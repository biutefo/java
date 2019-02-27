package pers.xin.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pers.xin.pojo.Person;

public class CollectionSort {

	
	
	static List<Person> personList = new ArrayList<Person>();

	public static void main(String[] args) {

		init();
		
		System.out.println("============================");
		for (Person person : personList) {
			System.out.println(person.toString());
		}
		System.out.println("============================");

		Collections.sort(personList, (person1, person2) -> person1.getAge().compareTo(person2.getAge()));
		
		System.out.println("============================");
		for (Person person : personList) {
			System.out.println(person.toString());
		}
		System.out.println("============================");
		
	}

	public static void init() {
		Person person1 = new Person();
		person1.setName("张三");
		person1.setAge(20);
		Person person2 = new Person();
		person2.setName("李四");
		person2.setAge(2);
		Person person3 = new Person();
		person3.setName("王五");
		person3.setAge(40);
		Person person4 = new Person();
		person4.setName("赵六");
		person4.setAge(18);
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
	}
}
