package MovieGame;

import java.io.FileNotFoundException;

public class GuessTheMovie {
    public static void main(String[] args) throws FileNotFoundException {
        Game game = new Game();
        game.fileReader();
    }
}
