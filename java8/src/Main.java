import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lambdaexpession.domain.Person;
import lambdaexpession.domain.Person.Sex;

public class Main {
	
	public static void main(String... args) {
		List<Person> persons = setUp();
		
	}
	
	private static List<Person> setUp() {
		Person person_1 = new Person.PersonBuilder("Kate").age(33).gender(Sex.FEMALE).build();
		Person person_2 = new Person.PersonBuilder("Bob").age(15).gender(Sex.MALE).build();
		Person person_3 = new Person.PersonBuilder("Aaron").age(66).gender(Sex.MALE).build();
		
		List<Person> persons = new ArrayList<>(Arrays.asList(person_1, person_2, person_3));
		
		return persons;
	}
	
	private static void printPersonWithAnonymusClass(List<String> persons) {
	}
	
}
