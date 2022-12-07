import java.util.Comparator;

public class CompareByName implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2) {
        int nameCompare = o1.name.compareTo(o2.name);
        if (nameCompare == 0){
            if (o1.age == o2.age){
                return 0;
            }
            if (o1.age < o2.age){
                return -1;
            }
            return 1;
        }
        return nameCompare;
    }
}
