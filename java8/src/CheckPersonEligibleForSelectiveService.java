import lambdaexpession.domain.Person;
import lambdaexpression.interfaces.CheckPerson;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {
	
	@Override
	public boolean test(Person person) {
		return person.getGender() == Person.Sex.MALE && person.getAge() > 23;
	}
}
