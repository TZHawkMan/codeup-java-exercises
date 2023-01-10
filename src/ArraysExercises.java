
import java.util.Arrays;
// Exercise 1:
import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }


//    String [] person;
//        person = new String[3];
    String [] personNames = {"john","bob","lucy"};
       for (int i = 0; i<personNames.length; i++){
           System.out.println(personNames[i]);
       }

       Arrays.fill(personNames,"angela");
        System.out.println(personNames[0]);




    }
}
