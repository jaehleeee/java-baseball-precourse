package baseball.model;

import static baseball.Constant.CommonConstant.*;
import static baseball.Constant.MessageConstant.*;

import java.util.HashSet;
import java.util.Set;

public class GameSystem {
    private BaseballGame baseballGame;

    public void runGameSystem() {
        do {
            baseballGame = new BaseballGame();
            baseballGame.run();
        } while (wantReGame());
    }

    private Boolean wantReGame() {
        String reGameWord = GameGuidePrinter.printGameFinish();
        isValidReGameWord(reGameWord);

        int reGameNum = Character.getNumericValue(reGameWord.charAt(0));
        return isReGame(reGameNum);
    }

    private boolean isReGame(int reGameNum) {
        if (reGameNum != 1 && reGameNum != 2) {
            throw new IllegalArgumentException(NEED_ONE_OR_TWO);
        }
        if (reGameNum == 1) {
            return true;
        }
        return false;
    }

    private static void isValidReGameWord(String reGameWord) {
        isValidLength(reGameWord, VALID_RE_GAME_NUM_LENGTH);
        isAllDigit(reGameWord);
    }


    public static void isValidWord(String playerNumWord) {
        isValidLength(playerNumWord, VALID_NUM_LENGTH);
        isAllDigit(playerNumWord);
        isAllDifferent(playerNumWord);
    }

    public static void isValidLength(String word, int validLength) throws IllegalArgumentException {
        if (word.length() != validLength) {
            throw new IllegalArgumentException(WRONG_NUM_LENGTH);
        }
    }

    public static void isAllDigit(String word) {
        for (int i = 0; i < word.length(); i++) {
            isDigitByIndex(word, i);
        }
    }

    public static void isDigitByIndex(String word, int index) throws IllegalArgumentException {
        if (!Character.isDigit(word.charAt(index))) {
            throw new IllegalArgumentException(WRONG_TYPE);
        }
    }

    public static void isAllDifferent(String word) throws IllegalArgumentException {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }

        if (set.size() != word.length()) {
            throw new IllegalArgumentException(NEED_DIFFERENT_NUM);
        }
    }
}
