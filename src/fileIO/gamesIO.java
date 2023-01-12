package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class gamesIO {
    public static void main(String[] args) throws IOException {

//        ------------------How to access file/paths------------------

        Path path = Paths.get("data","games.txt");
//
//        Path path2 = Paths.get("./src/data2", "gamesPt2.txt");
//
//        System.out.println("this checks for game .txt file: " + Files.exists(path));
//
//        System.out.println("this checks for gamept2.txt file: " + Files.exists(path2));
//
//        System.out.println(Files.notExists(path));
        Scanner sc = new Scanner(System.in);
//        String newFile = sc.nextLine();
//        Path newFilePath = Paths.get("data", newFile + ".txt");
//
//        Path newDir = Paths.get("moreData");
//        Files.createDirectories(newDir);
//        Files.createFile(newFilePath);

//        Path newJavaClass = Paths.get("src", newFile + ".java");
//        Files.createFile(newJavaClass);


//        ------------------------------writing/reading to/from file------------------
        System.out.println("enter 3 games");
        System.out.println("game 1: ");
        String game1 = sc.nextLine();
        System.out.println("game 2: ");
        String game2 = sc.nextLine();
        System.out.println("game 3: ");
        String game3 = sc.nextLine();
        List<String> gameList = Arrays.asList(game1.toLowerCase(), game2.toLowerCase(), game3.toLowerCase());
        Files.write(path, gameList);
//        List<String> fileGameList = Files.readAllLines(path);
//        Files.readAllLines(path);
//        System.out.println(Files.readAllLines(path));
//        for(String game: fileGameList){
//            System.out.println(game);
//        }


//        ---------------------Adding new/replacing lines to file------------------
//        adding line
        System.out.println("Add new game");
        String newGame = sc.nextLine();
        Files.write(path, Arrays.asList(newGame.toLowerCase()), StandardOpenOption.APPEND);

        //updating/changing line
        //gets old file lines
        List<String> fileGameList = Files.readAllLines(path);
        Files.readAllLines(path);
        //new file content
        List<String> newFileContent = new ArrayList<>();
        for(String game: fileGameList){
            //checks line for update condition, if true then replace and continue
            //to avoid old value being added
            if(game.contains("roblox")){
                System.out.println("roblox sucks");
                String updatedGame =  sc.nextLine();
                newFileContent.add(updatedGame);
                //ensures that for loop skips line 79 so that the old value doesn't get added after the replacing value
                continue;
            }
            //if line won't be replaced, add current line into the new list that will be pushed into the file
            newFileContent.add(game);
        }
        //replaces old list with the new list
        Files.write(path, newFileContent);
    }
}