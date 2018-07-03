package logics.java8.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import logics.java8.model.Person;

public class TestStreams {

	private static List<Person> personList;
	public static void main(String[] args) {

		personList = Person.getPersonsAsList();

		/*System.out.println("Before Sort");
		for (Person Person : personList) {
			System.out.println(Person);
		}*/
		
		//Before java 8
		/*Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});*/
		
	     //List.sort() since Java 8
		/*personList.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});*/
		
		// using lambda
//		personList.sort((Person o1, Person o2)->o1.getAge()-o2.getAge());
	
		/*System.out.println("After Sort");
		for (Person Person : personList) {
			System.out.println(Person);
		}*/
		
//		personList.forEach(person -> System.out.println(person.toString()));
		
//		personList.
		
		//requireNonNull(null, "should be nullpointer");
		
		
		//------------------
		/*List<String> list = Arrays.asList("abc1", "abc", "abc3","abcabc2");
		
		Optional<String> stream = list.stream().filter(element -> {
		    System.out.println("filter() was called ::"+element);
		    return element.contains("11");
		}).map(element -> {
			System.out.println("map() was called::"+element);
		    return element.toUpperCase();
		}).findAny();*/
		
		//----------------------------------------------------
			//---- collector-->String (joiner)
		//System.out .println( personList.stream() .filter(person -> { return Integer.valueOf( person.getFirstName().charAt(person.getFirstName().length() - 1)) % 2 == 0; }) .map(Person::getFirstName) .collect(Collectors.joining("|", "[", "]")));
		
		
		//----------------------------------------------------
		filterMap();
	}
	
	private static void filterMap(){

		List<Integer> acceptedAges = Arrays.asList(5, 10, 15);
		
		Map<Integer, Set<Person>> ageGroupMaps = Person.getPersonsAsMapByAgeGroup();
		
		List<Person> filteredPerson = new ArrayList<Person>();
		
		ageGroupMaps.entrySet().stream().filter(entry -> {return acceptedAges.contains(entry.getKey());})
										.forEach(p -> { filteredPerson.addAll(p.getValue()); });
		
		filteredPerson.forEach(person -> System.out.println(person.toString()));
	}
	
}
