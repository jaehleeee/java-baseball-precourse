package baseball.model;

import static baseball.Constant.CommonConstant.VALID_NUM_LENGTH;

import java.util.HashSet;
import java.util.Set;

public class GameJudge {

    private static final String WRONG_NUM_LENGTH_MSG = "3개의 숫자를 입력해야 합니다.";
    private static final String WRONG_TYPE_MSG = "숫자만 입력해야 합니다.";
    private static final String SAME_NUM_MSG = "서로 다른 숫자를 입력해야 합니다.";

    public static void isValidWord(String playerNumWord) {
        isValidLength(playerNumWord);
        isAllDigit(playerNumWord);
        isAllDifferent(playerNumWord);
    }

    public static void isValidLength(String word) throws IllegalArgumentException {
        if (word.length() != VALID_NUM_LENGTH) {
            throw new IllegalArgumentException(WRONG_NUM_LENGTH_MSG);
        }
    }

    public static void isAllDigit(String word) {
        for (int i = 0; i < word.length(); i++) {
            isDigitByIndex(word, i);
        }
    }

    public static void isDigitByIndex(String word, int index) throws IllegalArgumentException {
        if (!Character.isDigit(word.charAt(index))) {
            throw new IllegalArgumentException(WRONG_TYPE_MSG);
        }
    }

    public static void isAllDifferent(String word) throws IllegalArgumentException {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }

        if (set.size() != word.length()) {
            throw new IllegalArgumentException(SAME_NUM_MSG);
        }
    }
}
