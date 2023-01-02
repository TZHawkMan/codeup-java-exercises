import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {


        Scanner bob = new Scanner(System.in);

        System.out.print("Can I ask you a question? [Sure/no] ");
        String userInput = bob.next();
        boolean confirmation = userInput.equalsIgnoreCase("sure");
        System.out.println(confirmation);



        System.out.println("Whoa, chill out!");

        System.out.println("Fine. Be that way!");
        System.out.println("Whatever.");








    }
}
