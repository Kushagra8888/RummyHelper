
import java.util.*;

/**
 * Created by test on 7/30/2015.
 */
public class RummyHelper {

    private CardsCombination cardsCombination;

    RummyHelper() {
        cardsCombination = CardsCombination.getInstance();
    }

    private boolean isNaturalSeqPresent (int[] cards) {
            Arrays.sort(cards);
            for (int i = 0; i < cards.length -1; i++) {
                if (cards[i+1] == 53) {
                    return false;
                }
                if (cards[i+1] < cards[i]) {
                    return false;
                }
            }
            return true;
        }


    private int getCardCountToMakeNaturalSeq (int[] cards) {
        int requiredCardCount = 2;
        int minReqCount = requiredCardCount;
        for (int i=0; i < cards.length; i++) {
            if (cards[i+1] > cards[i]) {
                requiredCardCount --;
                if (requiredCardCount == 0)
                    return requiredCardCount;
            } else {
                if (requiredCardCount < 2) {
                    requiredCardCount ++;
                }
            }
            minReqCount = requiredCardCount < minReqCount ? requiredCardCount: minReqCount;
        }
        return minReqCount;
    }

    public int getMinimumReplacementsForWin(int[] handCards) {
        int jokerCount =0;
        Arrays.sort(handCards);
        int i = 0;
        for (i=0; i < handCards.length; i++) {
            if (handCards[i] == 53) {
                break;
            }
        }
        int[] hCards = Arrays.copyOf(handCards, i);
        Arrays.sort(hCards);
        jokerCount = handCards.length - i;

        int minRepCount = cardsCombination.getDiffFromValidCombination(hCards);

        if (jokerCount != 0) {
            if ( ! isNaturalSeqPresent(hCards)) {
                int seqCardCount = getCardCountToMakeNaturalSeq(hCards);
                if (minRepCount > seqCardCount) {
                    jokerCount = jokerCount > seqCardCount ? jokerCount - seqCardCount : 0;
                }
            }
            minRepCount = minRepCount - jokerCount;
        }
        return minRepCount;
    }

}
