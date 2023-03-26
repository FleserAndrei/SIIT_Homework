import java.util.Comparator;

public class ComparatorByLastName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.lastName.compareTo(o2.lastName);
        if (result == 0) {
            result = o1.firstName.compareTo(o2.firstName);
        }
        return result;
    }
}
