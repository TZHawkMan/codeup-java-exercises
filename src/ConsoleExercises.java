import java.util.Scanner;

//.1
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        ;
        System.out.printf("The value of pi is approximately %.2f ! ", pi);
        System.out.print(pi);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number ");
//        int userInput = scanner.nextInt();
//2.
        Scanner scanner1 = new Scanner(System.in);


        System.out.println("Please enter 3 words: ");


        String word1 = scanner1.next();
        String word2 = scanner1.next();
        String word3 = scanner1.next();

        System.out.printf("%s %n %s %n %s %n",word1, word2, word3);
        System.out.println("");
        scanner1.nextLine();


//3.
        System.out.println("Enter a sentence: ");
        String userSentence = scanner1.nextLine();
        System.out.printf("your sentence is : %s %n", userSentence);

//4.
        System.out.println("Enter the length of the room: ");
        String lengthInput = scanner1.nextLine();

        System.out.println("Enter the width of the room: ");
        String widthInput = scanner1.nextLine();

        System.out.printf("length: %s and width: %s %n", lengthInput, widthInput);
        int length = Integer.parseInt(lengthInput);
        int width = Integer.parseInt(widthInput);

        int area = width*length;
        int perimeter = (length*2) + (width*2);
        System.out.printf ("Area of the room: %s %n", area);
        System.out.printf ("perimeter of the room: %s %n", perimeter);

//bonus

    }}