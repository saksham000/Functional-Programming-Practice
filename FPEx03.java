import java.util.List;

public class FPEx03 {

    public static void main(String[] args) {


        List <Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        List<String> courses = List.of("spring boot", "spring", "AWS", "API", "Docker", "python");

        // list.stream().filter(num -> num % 2 != 0).map(num -> num * num * num).forEach(System.out::println);

        courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
        
    }
}
