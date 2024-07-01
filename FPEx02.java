import java.util.List;

public class FPEx02 {
    public static void main(String[] args) {
        

        List<String> courses = List.of("spring boot", "spring", "AWS", "API", "Docker", "python");

        // courses.stream().filter(course -> course.contains("spring")).forEach(System.out::println); //contains is used to check that thing in list
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);

    }
}
