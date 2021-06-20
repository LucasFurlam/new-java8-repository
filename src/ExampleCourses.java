import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using Java 8 Streams, Collectors and APIs.
 */

class Course {

    private String name;
    private Integer students;

    public Course(String name, Integer students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudents() {
        return students;
    }

    public void setStudents(Integer students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", alunos=" + students +
                '}';
    }
}

public class ExampleCourses {

    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Python", 45));
        courses.add(new Course("JavaScript", 150));
        courses.add(new Course("Java 8", 113));
        courses.add(new Course("C", 55));

        courses.sort(Comparator.comparing(Course::getStudents));

        int sum = courses.stream()
                .filter(c -> c.getStudents() >= 100)
                .mapToInt(Course::getStudents)
                .sum();

        System.out.println(sum);

        courses.stream()
                .filter(c -> c.getStudents() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println("\n" + c.getName() + "\n"));

        courses.stream()
                .filter(c -> c.getStudents() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getName(),
                        c -> c.getStudents()))
                .forEach((name, students) -> System.out.println(name + " tem " + students + " students "));

    }

}

