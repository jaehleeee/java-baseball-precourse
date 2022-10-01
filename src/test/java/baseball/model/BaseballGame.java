package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import org.assertj.core.util.Lists;

public class BaseballGame {

    private static final int ANSWER_NUM_SIZE = 3;
    private static final int NUM_START_IDX = 1;
    private static final int NUM_END_IDX = 9;
    private List<Integer> answerNumList;

    public void start() {
        generateAnswerNumList();
    }

    private void generateAnswerNumList() {
        List<Integer> newAnswerNumList = Lists.newArrayList();

        while (newAnswerNumList.size() < ANSWER_NUM_SIZE) {
            Integer newNum = Randoms.pickNumberInRange(NUM_START_IDX, NUM_END_IDX);
            addNumToList(newAnswerNumList, newNum);
        }

        answerNumList = newAnswerNumList;
    }

    private void addNumToList(List<Integer> newAnswerNumList, Integer newNum) {
        if (newAnswerNumList.contains(newNum)) {
            return;
        }

        newAnswerNumList.add(newNum);
    }
}
