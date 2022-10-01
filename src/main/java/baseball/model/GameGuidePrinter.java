package baseball.model;

import static baseball.Constant.MessageConstant.*;

import camp.nextstep.edu.missionutils.Console;

public class GameGuide {

    public static String printAskInputNumber() {
        System.out.printf(ASK_INPUT_NUMBER);
        return Console.readLine();
    }

    public static void printHint(Player player) {
        if (player.isNothing()) {
            System.out.println(GUIDE_HINT_NOTHING);
            return;
        }

        if (player.hasBallAndStrike()) {
            System.out.print(String.format(GUIDE_HINT_BALL_STRIKE, player.getBall() ,player.getStrike()));
            return;
        }

        if (player.hasOnlyBall()) {
            System.out.print(String.format(GUIDE_HINT_BALL, player.getBall()));
            return;
        }

        if (player.hasOnlyStrike()) {
            System.out.println(String.format(GUIDE_HINT_STRIKE, player.getStrike()));
        }
    }

    public static String printGameFinish() {
        System.out.println(GUIDE_GAME_FINISH);
        System.out.println(ASK_RE_GAME);
        return Console.readLine();
    }
}
