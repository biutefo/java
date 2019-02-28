package pers.xin.functionReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pers.xin.Comparator.PersonComparator;
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
		//1.方法引用：把方法名当作一个接口
		//Collections.sort(personList, Person::compareTo);
		//类似这种写法，传入一个方法（引用已经存在的比较方法）
		//Collections.sort(personList, new PersonComparator()::compare);
		//2.匿名内部类
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.compareTo(o2);
			}
			
		});
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