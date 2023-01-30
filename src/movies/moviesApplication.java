package movies;

import.java.util.Input;

public class MoviesApplication {
    public static void getAllMoviesFromCategory(String category, Movie[] movies){
        for (Movie movie : movies){
            if  (category.equals(movie.getCategory())){
                String name = movie.getName();
                System.out.printf("%s -- %s%n", name, category);
            }
        }
    }

    public static Movie[] addMovie(Movie newMovie, Movie[] movies) {
        Movie[] newMovieArray;
        newMovieArray = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++){
            newMovieArray[i] = movies[i];
        }
        newMovieArray[newMovieArray.length - 1] = newMovie;
        return newMovieArray;
    }

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = moviesArray.findAll();
        String userChoice = "-1";
        while (!userChoice.equals("0")) {
            System.out.println("");
            System.out.println("What would you like to do");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie to the list");
            userChoice = input.getString("Enter your choice:");
            switch(userChoice){
                case "0":
                    break;
                case "1":
                    for (Movie movie : movies) {
                        String name = movie.getName();
                        String category = movie.getCategory();
                        System.out.printf("%s -- %s%n", name, category);
                    }
                    break;
                case "2":
                    for (Movie movie : movies) {
                        String category = movie.getCategory();
                        if (category.equals("animated")){
                            String name = movie.getName();
                            System.out.printf("%s -- %s%n", name, category);
                        }
                    }
                    break;
                case "3":
                    getAllMoviesFromCategory("drama", movies);
                    break;
                case "4":
                    getAllMoviesFromCategory("horror", movies);
                    break;
                case "5":
                    getAllMoviesFromCategory("scifi", movies);
                    break;
                case "6":
                    String title = input.getString("Enter the name of the movie:");
                    String category = input.getString("Enter the category of the movie:");

                    Movie newMovie = new Movie(title, category);
                    movies = addMovie(newMovie, movies);
                    break;
            }
        }
    }
}