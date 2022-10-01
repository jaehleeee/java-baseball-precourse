package baseball.model;

import camp.nextstep.edu.missionutils.Console;

public class GameGuide {

    private static final String ASK_INPUT_NUMBER = "숫자를 입력해주세요. : ";
    private static final String GUIDE_GAME_FINISH = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String ASK_RE_GAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String printAskInputNumber() {
        System.out.printf(ASK_INPUT_NUMBER);
        return Console.readLine();
    }

    public static String printGameFinish() {
        System.out.println(GUIDE_GAME_FINISH);
        System.out.println(ASK_RE_GAME);
        return Console.readLine();
    }
}
