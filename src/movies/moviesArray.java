package movies;

public class moviesArray {
    public static Movie[] findAll() {
        return new Movie[]{
                new Movie("Citizen Kane", "drama"),
                new Movie("Casablanca", "drama"),
                new Movie("The Godfather", "drama"),
                new Movie("Gone With The Wind", "drama"),
                new Movie("Lawrence Of Arabia", "drama"),
                new Movie("The Wizard Of Oz", "musical"),
                new Movie("The Graduate", "drama"),
        };
    }
}