import java.util.List;

public class FP01Functional {

    // private static void print(int number){
    // System.out.println(number);

    // }

    // private static void printAllNumberInListFunctional(List<Integer> num) {
    // // num.stream().forEach(FP01Functional::print);// this is called method
    // // refference
    // num.stream().forEach(System.out::println); // in this way we do not need a
    // function to print
    // }

    // private static boolean isEven(int number){
    // return number % 2 == 0;
    // }

    private static void printEvenNumberInListFunctional(List<Integer> num) {

        num.stream()
                // .filter(FP01Functional::isEven)// filter which is used when true comes it
                // will print number but this is complex beacuse we have to make a sperate
                // function so use lambda insted
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
    
    private static void printSquaresOfEvenNumberInListFunctional(List<Integer> num) {

        num.stream().filter(number -> number % 2 == 0).map(x -> x * x).forEach(System.out::println); //map is used to take each number and do something on that number only
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 55, 66, 3, 7);

        // printEvenNumberInListFunctional(list);
        printSquaresOfEvenNumberInListFunctional(list);

    }

}