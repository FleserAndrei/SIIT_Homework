import java.util.Comparator;

public class ComparatorByBirthDate implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.dateOfBirth.compareTo(o2.dateOfBirth);
        if (result == 0) {
            result = o1.lastName.compareTo(o2.lastName);
        }
        return result;
    }
}
