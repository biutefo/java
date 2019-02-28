package pers.xin.Comparator;

import java.util.Comparator;

import pers.xin.pojo.Person;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return Integer.compare(p1.getAge(), p2.getAge());
	}

}
