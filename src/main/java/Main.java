import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<Person> (new CompareByName());


        Address address1 = new Address();
        address1.city = "Paris";
        address1.country = "France";

        Address address2 = new Address();
        address2.city = "London";
        address2.country = "England";

        List<Address>addresses = new ArrayList<Address>();

        addresses.add(address1);
        addresses.add(address2);

        Hobby hobby1 = new Hobby();
        hobby1.addresses = addresses;
        hobby1.name = "running";
        hobby1.frequency = 4;

        Hobby hobby2 = new Hobby();
        hobby2.addresses = addresses;
        hobby2.name = "Cycling";
        hobby2.frequency = 2;


        List<Hobby>hobbies = new ArrayList<Hobby>();
        hobbies.add(hobby1);

        Person person1 = new Person();
        person1.name = "Paul";
        person1.age = 23;
        people.add(person1);

        Person person2 = new Person();
        person2.name = "Claudiu";
        person2.age = 22;
        people.add(person2);


        HashMap<Person, List<Hobby>> personListHashMap = new HashMap<Person, List<Hobby>>();
        personListHashMap.put(person1, hobbies);

        for (Person person : people){

            System.out.print(person.name + " , ");
            System.out.println(person.age);

        }

        for(Hobby hobby : personListHashMap.get(person1)){
            for (Address address : hobby.addresses){
                System.out.println(hobby.name + " " + address.country);
            }
        }


        /*you need to store Person in a TreeSet

define 2 Comparators (one for name and one for age) that will be used when creating the TreeSet

add Person to the TreeSet

iterate through the TreeSet and print the name and the age

you need to store some information about people: for one person, you need a list of his/her hobbies

define for Hobby a class that contains

name of the hobby (String) – ex: cycling, swimming

frequency (int) – how many times a week they practice it

list of addresses where this hobby can be practiced (List<Address>)

you will use a HashMap with the following structure <Person, List<Hobby>>

add some information to this map - any detail you consider relevant

for a certain Person, print the names of the hobbies and the countries where it can be practiced

use some example classes, appropriately, such as: Person, Unemployed, Hired, Student, Address, Country

 */
    }
}
