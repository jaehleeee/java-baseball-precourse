package baseball.model;

import static baseball.Constant.CommonConstant.NUM_END_IDX;
import static baseball.Constant.CommonConstant.NUM_START_IDX;
import static baseball.Constant.CommonConstant.VALID_NUM_LENGTH;
import static baseball.model.GameJudge.isValidWord;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import org.assertj.core.util.Lists;

public class BaseballGame {

    private List<Integer> answerNumList;

    public BaseballGame() {
        generateAnswerNumList();
    }

    public List<Integer> getAnswerNumList() {
        return answerNumList;
    }

    public void run() {
        String playerNumWord = GameGuide.printAskInputNumber();
        isValidWord(playerNumWord);

        String wantReGame = GameGuide.printGameFinish();
    }

    private void generateAnswerNumList() {
        answerNumList = Lists.newArrayList();

        while (answerNumList.size() < VALID_NUM_LENGTH) {
            Integer newNum = Randoms.pickNumberInRange(NUM_START_IDX, NUM_END_IDX);
            addNumToList(answerNumList, newNum);
        }
    }

    private void addNumToList(List<Integer> newAnswerNumList, Integer newNum) {
        if (newAnswerNumList.contains(newNum)) {
            return;
        }

        newAnswerNumList.add(newNum);
    }
}
