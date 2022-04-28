import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class J8StreamOfPersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Person> personLst = List.of(
		new Person ("Abhi" , 21),
		new Person ("Peter" , 18),
		new Person ("Puni" , 60)
		);
System.out.println(personLst);
Predicate<Person> adult = p -> p.getAge() >= 21;
personLst
.stream()
.filter(adult)
.forEach(Person::sayHello);
personLst
.parallelStream()
.forEach(p -> System.out.println(p.getName()));
double aveAgeAdults = personLst
.stream
.filter(adult)
.mapToInt(Person::getAge)
.average()
.getAsDouble();
System.out.println(aveAgeAdults);
int sumAges = personLst
.stream
.collect(Collectors.summingInt(Person::getAge));
System.out.println(sumAges);
List<String> nameStartWithP = personLst
.stream()
.filter(p -> p.getName().charAt(0) == 'p')
.map(Person::getName)
.collect(Collectors.toList());
System.out.println(nameStartWithP);
	}

}
