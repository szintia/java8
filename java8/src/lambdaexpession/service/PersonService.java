package lambdaexpession.service;

import java.util.List;

import lambdaexpession.domain.Person;
import lambdaexpression.interfaces.CheckPerson;

public class PersonService {
	
	public static void printPersonOlderThan(List<Person> persons, int age) {
		for(Person person : persons) {
			if(person.getAge() > age) {
				person.print();
			}
			
		}
	}
	
	public static void printPersonWithinAgeRange(List<Person> persons, int from, int to) {
		for(Person person : persons) {
			if(person.getAge() >= from && person.getAge() <= to) {
				person.print();
			}
		}
	}
	
	public static void printPerson(List<Person> persons, CheckPerson checkPerson) {
		for(Person person : persons) {
			if(checkPerson.test(person)) {
				person.print();
			}
		}
	}
}
