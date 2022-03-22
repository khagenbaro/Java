package MovieGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    GuessTheMovie guessTheMovie = new GuessTheMovie();
    public GuessTheMovie getGuessTheMovie() {
        return guessTheMovie;
    }

    public void setGuessTheMovie(GuessTheMovie guessTheMovie) {
        this.guessTheMovie = guessTheMovie;
    }


    void randomNumber() {
        int randomNum = (int) Math.random() * 10;


    }
    void fileReader() throws FileNotFoundException {
        File file = new File("/home/khagenbaro/IdeaProjects/first/src/MovieGame/moviename.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String movieFile = sc.nextLine();
            System.out.println(movieFile);

        }

    }
}
