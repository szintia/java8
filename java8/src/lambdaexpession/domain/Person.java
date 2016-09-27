package lambdaexpession.domain;

import java.time.LocalDate;

public class Person {
	
	public enum Sex {
		FEMALE, MALE;
	}
	
	private final String name;
	private final LocalDate birthDay;
	private final Sex gender;
	private final int age;
	private final String email;
	
	public Person(PersonBuilder builder) {
		this.name = builder.name;
		this.birthDay = builder.birthDay;
		this.gender = builder.gender;
		this.age = builder.age;
		this.email = builder.email;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getBirthDay() {
		return birthDay;
	}
	
	public Sex getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void print() {
		System.out.println("The person is: " + name);
	}
	
	
	public static class PersonBuilder {
		private final String name;
		private LocalDate birthDay;
		private Sex gender;
		private int age;
		private String email;
		
		public PersonBuilder(String name) {
			this.name = name;
		}
		
		public PersonBuilder birthDay(LocalDate birthDay) {
			this.birthDay = birthDay;
			return this;
		}
		
		public PersonBuilder gender(Sex gender) {
			this.gender = gender;
			return this;
		}
		
		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}
}
