
import java.util.*;

/**
 * Created by test on 7/30/2015.
 */
public class RummyHelper {

    public static final int JOKER_CARD = 53;

    CardsCombination cardsCombination;
    RummyHelper() {
        cardsCombination = CardsCombination.getInstance();
    }

    private boolean isNaturalSeqPresent (int[] cards) {
            Arrays.sort(cards);
            if (isTenaliPresent(cards)) {
                return true;
            }
            if ( Arrays.asList(cards).contains(1) && Arrays.asList(cards).contains(52) && Arrays.asList(cards).contains(51)) {
                return true;
            }
            int requiredCardCount = 2;

            for (int i = 0; i < cards.length - 1; i++) {
                if (cards[i + 1] == cards[i] + 1) {
                    requiredCardCount--;
                    if (requiredCardCount == 0)
                        return true;
                } else {
                    requiredCardCount = 2;
                }
            }
            return true;
        }

    private boolean isTenaliPresent(int[] hand){
        int consecutives = 1;
        for (int idx = 1; idx < hand.length; idx++){
            if (hand[idx] == hand[idx - 1]){
                consecutives += 1;
            }
            else{
                consecutives = 1;
            }
            if (consecutives > 2){
                return true;
            }
        }
        return false;
    }

    private int getCardCountToMakeNaturalSeq (int[] cards) {
        int requiredCardCount = 2;
        int minReqCount = requiredCardCount;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i + 1] > cards[i]) {
                requiredCardCount--;
                if (requiredCardCount == 0)
                    return requiredCardCount;
            } else {
                if (requiredCardCount < 2) {
                    requiredCardCount++;
                }
            }
            minReqCount = requiredCardCount < minReqCount ? requiredCardCount : minReqCount;
        }
        return minReqCount;
    }

    public int getMinimumReplacementsForWin(int[] handCards) {
        int jokerCount =0;
        Arrays.sort(handCards);
        int i = 0;
        for (i=0; i < handCards.length; i++) {
            if (handCards[i] == JOKER_CARD) {
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
            System.out.println("minrepCount is "+minRepCount);
            minRepCount = minRepCount - jokerCount;
        }

        return minRepCount;
    }

}
