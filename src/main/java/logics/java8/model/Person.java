/**
 * 
 */
package logics.java8.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Ashutosh
 * @date Jul 4, 2018
 */
public class Person {

	private String firstName;
	private String lastName;
	private String adsress;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdsress() {
		return adsress;
	}

	public void setAdsress(String adsress) {
		this.adsress = adsress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String firstName, String lastName, String adsress, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adsress = adsress;
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", adsress=");
		builder.append(adsress);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	public static List<Person> getPersonsAsList() {
		List<Person> result = new ArrayList<Person>();
		result.add(new Person("FirstName1", "LastName1", "Adddress1", 11));
		result.add(new Person("FirstName2", "LastName2", "Adddress2", 2));
		result.add(new Person("FirstName3", "LastName3", "Adddress3", 31));
		result.add(new Person("FirstName4", "LastName4", "Adddress4", 14));
		result.add(new Person("FirstName5", "LastName5", "Adddress5", 21));
		result.add(new Person("FirstName6", "LastName6", "Adddress6", 16));
		result.add(new Person("FirstName11", "LastName11", "Adddress1", 13));
		result.add(new Person("FirstName12", "LastName12", "Adddress2", 7));
		result.add(new Person("FirstName13", "LastName13", "Adddress3", 18));
		result.add(new Person("FirstName14", "LastName14", "Adddress4", 24));
		result.add(new Person("FirstName15", "LastName15", "Adddress5", 15));
		result.add(new Person("FirstName16", "LastName16", "Adddress6", 36));
		return result;
	}
	
	public static Set<Person> getPersonsAsSet() {
		Set<Person> result = new LinkedHashSet<Person>();
		result.add(new Person("FirstName1", "LastName1", "Adddress1", 1));
		result.add(new Person("FirstName2", "LastName2", "Adddress2", 2));
		result.add(new Person("FirstName3", "LastName3", "Adddress3", 3));
		result.add(new Person("FirstName4", "LastName4", "Adddress4", 4));
		result.add(new Person("FirstName5", "LastName5", "Adddress5", 5));
		result.add(new Person("FirstName6", "LastName6", "Adddress6", 6));
		result.add(new Person("FirstName11", "LastName11", "Adddress1", 11));
		result.add(new Person("FirstName12", "LastName12", "Adddress2", 12));
		result.add(new Person("FirstName13", "LastName13", "Adddress3", 13));
		result.add(new Person("FirstName14", "LastName14", "Adddress4", 14));
		result.add(new Person("FirstName15", "LastName15", "Adddress5", 15));
		result.add(new Person("FirstName16", "LastName16", "Adddress6", 16));
		return result;
	}
	
	public static Map<String, Person> getPersonsAsMap() {
		Map<String,Person> result = new HashMap<String,Person>();
		result.put("Person1",new Person("FirstName1", "LastName1", "Adddress1", 1));
		result.put("Person2",new Person("FirstName2", "LastName2", "Adddress2", 2));
		result.put("Person3",new Person("FirstName3", "LastName3", "Adddress3", 3));
		result.put("Person4",new Person("FirstName4", "LastName4", "Adddress4", 4));
		result.put("Person5",new Person("FirstName5", "LastName5", "Adddress5", 5));
		result.put("Person6",new Person("FirstName6", "LastName6", "Adddress6", 6));
		result.put("Person11",new Person("FirstName11", "LastName11", "Adddress1", 11));
		result.put("Person12",new Person("FirstName12", "LastName12", "Adddress2", 12));
		result.put("Person13",new Person("FirstName13", "LastName13", "Adddress3", 13));
		result.put("Person14",new Person("FirstName14", "LastName14", "Adddress4", 14));
		result.put("Person15",new Person("FirstName15", "LastName15", "Adddress5", 15));
		result.put("Person16",new Person("FirstName16", "LastName16", "Adddress6", 16));
		return result;
	}
	
	public static Map<Integer, Set<Person>> getPersonsAsMapByAgeGroup() {
		Map<Integer, Set<Person>> result = new HashMap<Integer, Set<Person>>();
		
		Set<Person> personSet = new HashSet<Person>();
		
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 1));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 2));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 3));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 4));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 5));
		result.put(5,personSet);
		
		personSet = new HashSet<Person>();
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 6));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 7));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 8));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 9));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 10));
		result.put(10,personSet);
		
		personSet = new HashSet<Person>();
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 11));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 12));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 13));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 14));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 15));
		result.put(15,personSet);
		
		personSet = new HashSet<Person>();
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 16));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 17));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 18));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 19));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 20));
		result.put(20,personSet);
		
		personSet = new HashSet<Person>();
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 21));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 22));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 23));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 24));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 25));
		result.put(25,personSet);
		
		personSet = new HashSet<Person>();
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 26));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 27));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 28));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 29));
		personSet.add(new Person("FirstName1", "LastName1", "Adddress1", 30));
		result.put(30,personSet);
		return result;
	}
}
