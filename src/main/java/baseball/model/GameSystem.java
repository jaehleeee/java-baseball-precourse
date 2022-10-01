package baseball.model;

public class GameSystem {
    private BaseballGame baseballGame;

    public void runGameSystem() {
        do {
            baseballGame = new BaseballGame();
            baseballGame.start();
        } while (wantReGame());
    }

    private Boolean wantReGame() {
        // TODO

        return true;
    }
}
