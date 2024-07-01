import java.util.List;

public class FPEx01 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        list.stream().filter(number -> number % 2 != 0).forEach(System.out::println);

    }
}
