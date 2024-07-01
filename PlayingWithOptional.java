import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String[] args) {

        List <String> list = List.of("apple","banana", "mango");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");

        //when ever there is a chance that the value can be null then use optional it will prevent null pointer exception
        Optional<String> optional = list.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

    }
}
