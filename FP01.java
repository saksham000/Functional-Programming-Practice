import java.util.List;

public class FP01{


    private static void printAllNumberInListStru(List<Integer> num){
        for(int number:num){
            System.out.println(number);
        }
    } 


    private static void printEvenNumberInListStru(List<Integer> num){
        for(int number:num){
            if(number%2==0)
            System.out.println(number);
        }
    } 
    public static void main(String[] args) {
        // printAllNumberInListStru(List.of(1,2,3,4,5,55,66,3,7));
        List<Integer> numbers = List.of(1,2,3,4,5,55,66,3,7);
        printEvenNumberInListStru(numbers);
    }
}