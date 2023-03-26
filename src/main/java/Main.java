import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        addStudent("Arnold", "Dame", LocalDate.parse("1999-03-19"), 'M', 199245756, studentList);
        addStudent("Viorica", "Lacatus", LocalDate.parse("1991-02-11"), 'F', 294345754, studentList);
        addStudent("Viorel", "Lacatus", LocalDate.parse("1987-01-29"), 'M', 178235476, studentList);

//        System.out.println(studentList.stream().count());
//
//        deleteStudent(294345754, studentList);
//
//        System.out.println(studentList.stream().count());
//
//        List<Student> studentsAge = retrieveStudent(23, studentList);
//
//        System.out.println(studentsAge.stream().count());
    }

    public static void addStudent(String firstName, String lastName, LocalDate dateOfBirth, char Gender, int ID, List<Student> studentList) {

        Student student = new Student();

        student.firstName = firstName;
        student.lastName = lastName;
        student.dateOfBirth = dateOfBirth;
        student.Gender = Gender;
        student.ID = ID;

        studentList.add(student);
    }

    public static void deleteStudent(int ID,List<Student> studentList){

        for (Student student:studentList) {
            if (student.ID  == ID) {
                int index = studentList.indexOf(student);
                studentList.remove(index);
                break;
            }

        }

    }
    public static List<Student> retrieveStudent(int age,List<Student> studentList){

        List<Student> students = new ArrayList<>();

        for (Student student:studentList) {
            Period period = Period.between(student.dateOfBirth, LocalDate.now());
            if (period.getYears() == age){
                students.add(student);
            }

        }
        return students;



    }





}
