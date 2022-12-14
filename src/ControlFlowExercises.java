import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // Questions 1:

//        int i = 5;
//        while ( i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//       int x = 0;
//        do {
//        if(x%2 == 0) {
//            System.out.println(x); //Statements
//        }x++;
//
//        }while ( x <= 100);


//        for (int i = 5; i <= 15; i++) {
//            System.out.println("i is " + i);
//
//
//        }
//        long count3 = 2;
//        do {
//            System.out.println(count3);
//            count3 *= count3;
//        }while(count3 < 1000000);


//        for (int i = 0 ; i <= 100; i+=2){
//            System.out.println( " i is " + i );
//        }

//        for (int i = 100; i >= -10; i-= 5){
//            System.out.println( " i is " + i );
//        }

//        for ( long i = 2; i <= 1_000_000; i*=i ){
//            System.out.println( i);
//        }


//        for (int i= 1; i <= 100; i++) {
//            System.out.println("i is " + i);
//        }


        //Questions 2.

//int count4 =1;
//while (count4 <=100){
//    if(count4 % 3 == 0 && count4%5 == 0){
//        System.out.println("FizzNuzz");
//    }else if (count4%3 == 0){
//        System.out.println( "Fizz");
//    } else if (count4%5 == 0) {
//        System.out.println("Buzz");
//    } else {
//        System.out.println(count4);
//
//    }count4++;
//}

//Questions 3:
        Scanner steve = new Scanner(System.in);
        int userInput = 0;
        String playAgain = "y";

        while(playAgain.equalsIgnoreCase("y")){
            System.out.println("What number would you like to go to?");
            userInput = steve.nextInt();
            System.out.println("Here is your table ! \n");
            System.out.println("number | squared | cubed");
            System.out.println("----- | ------  | -------");
            for (int i = 1; i <= userInput; i++){;
            System.out.printf(" %s     | %s       | %s     \n", i, i*i, i*i*i);

        }
        System.out.println("play a game ?");
        playAgain = steve.next();}












    }}

